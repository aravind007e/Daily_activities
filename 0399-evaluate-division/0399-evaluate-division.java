class Solution {

    public double[] calcEquation(List<List<String>> equations,double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.get(v).put(u, 1.0 / values[i]);
        }
        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);

            if (!graph.containsKey(src) || !graph.containsKey(dst)) {
                ans[i] = -1.0;
            } else if (src.equals(dst)) {
                ans[i] = 1.0;
            } else {
                ans[i] = dfs(src, dst, graph, new HashSet<>());
            }
        }

        return ans;
    }

    double dfs(String src,
               String dst,
               Map<String, Map<String, Double>> graph,
               Set<String> visited) {

        if (src.equals(dst))
            return 1.0;

        visited.add(src);

        for (String next : graph.get(src).keySet()) {

            if (!visited.contains(next)) {

                double val = dfs(next, dst, graph, visited);

                if (val != -1.0) {
                    return graph.get(src).get(next) * val;
                }
            }
        }

        return -1.0;
    }
}