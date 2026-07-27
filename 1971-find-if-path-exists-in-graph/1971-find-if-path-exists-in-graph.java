class Solution {
    public static void dfs(int curr,List<List<Integer>> adj,boolean[] visited){
        visited[curr]=true;
        for(int i:adj.get(curr)){
            if(!visited[i]) dfs(i,adj,visited);
        }
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited=new boolean[n];
        dfs(source,adj,visited);
        return visited[destination];
    }
}