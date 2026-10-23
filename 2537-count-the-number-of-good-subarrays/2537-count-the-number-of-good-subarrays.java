class Solution {
    public long countGood(int[] nums, int k) {
        long ans=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        int i=0;
        long count=0;
        for(int j=0;j<nums.length;j++){
            int l=nums[j];
            int fre=h.getOrDefault(l,0);
            count+=fre;
            h.put(l,fre+1);
            while(count>=k){
                ans+=nums.length-j;
                int left=nums[i];

                h.put(left,h.get(left)-1);
                count-=h.get(left);
                i++;
            }
        }


        return ans;
    }
}