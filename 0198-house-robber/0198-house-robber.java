class Solution {
    public int rob(int[] nums) {
        int p2=0;
        int p1=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int max=Math.max(curr+p2,p1);
            p2=p1;
            p1=max;
        }
        return p1;
    }
}