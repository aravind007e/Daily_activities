class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();
        for (int[] edge : times) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[1] - b[1]);
        dist[k] = 0;
        pq.offer(new int[]{k, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int time = curr[1];
            if (time > dist[node])
                continue;
            for (int[] next : graph[node]) {
                int neighbor = next[0];
                int weight = next[1];
                if (dist[neighbor] > time + weight) {
                    dist[neighbor] = time + weight;
                    pq.offer(new int[]{neighbor, dist[neighbor]});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}