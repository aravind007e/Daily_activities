class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
         int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            curr=Math.max(curr,sum);
            
        }
       return curr;
    }
}