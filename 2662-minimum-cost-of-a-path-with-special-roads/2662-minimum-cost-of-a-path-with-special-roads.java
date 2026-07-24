class Solution {

    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));

        Map<Long, Long> dist = new HashMap<>();

        long key = encode(start[0], start[1]);

        pq.offer(new long[]{0, start[0], start[1]});
        dist.put(key, 0L);

        long ans = manhattan(start[0], start[1], target[0], target[1]);

        while(!pq.isEmpty()){

            long[] cur = pq.poll();

            long cost = cur[0];
            int x = (int)cur[1];
            int y = (int)cur[2];

            long k = encode(x,y);

            if(cost > dist.get(k))
                continue;

            ans = Math.min(ans,
                    cost + manhattan(x,y,target[0],target[1]));

            for(int[] road : specialRoads){

                int x1 = road[0];
                int y1 = road[1];
                int x2 = road[2];
                int y2 = road[3];
                int c = road[4];

                long newCost =
                        cost +
                        manhattan(x,y,x1,y1) +
                        c;

                long nk = encode(x2,y2);

                if(newCost < dist.getOrDefault(nk, Long.MAX_VALUE)){

                    dist.put(nk,newCost);
                    pq.offer(new long[]{
                            newCost,
                            x2,
                            y2
                    });
                }
            }
        }

        return (int)ans;
    }

    private long manhattan(int x1,int y1,int x2,int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }

    private long encode(int x,int y){
        return (((long)x)<<32) | (y & 0xffffffffL);
    }
}