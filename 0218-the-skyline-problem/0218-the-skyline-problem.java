class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {

        List<int[]> ans=new ArrayList<>();

        for(int[] b:buildings){
            ans.add(new int[]{b[0],-b[2]});
            ans.add(new int[]{b[1],b[2]});

        }

        Collections.sort(ans,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(0);
    
        int pre=0;

        List<List<Integer>>result=new ArrayList<>();

        for(int[] e:ans){
            int x=e[0];
            int y=e[1];

            if(y<0) pq.add(-y);
            else pq.remove(y);

            int curr=pq.peek();

            if(curr!=pre){
                result.add(Arrays.asList(x,curr));
                pre=curr;
            }
        }

        return result;
        
    }
}