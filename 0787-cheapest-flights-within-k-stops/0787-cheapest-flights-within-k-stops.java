class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[]=new int[n];

        Arrays.fill(dist,100000000);
        dist[src]=0;

        for(int i=0;i<=k;i++){
            int[]temp=dist.clone();
            for(int[] flight:flights){
                int u=flight[0];
                int v=flight[1];
                int cost=flight[2];

                if(dist[u]!=100000000 && dist[u]+cost<temp[v]) 
                temp[v]=dist[u]+cost;
            }
            dist=temp;
        }
        return dist[dst]==100000000? -1: dist[dst];
    }
}