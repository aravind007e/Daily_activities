class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
          s.add(nums[i]);
        }
        if(s.size()<3){
            int max=0;
            for(int i=0;i<n;i++){
                max=Math.max(max,nums[i]);
            }
            return max;
        }

        int newa[]=new int[s.size()];
        int k=s.size();
        int i=0;
    for(int l:s){
            newa[i++]=l;
        }
        Arrays.sort(newa);
        return newa[k-3]; 
    }
}