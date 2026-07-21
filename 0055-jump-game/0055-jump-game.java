class Solution {
    public boolean canJump(int[] nums) {
        int maxi=0;
        if(nums.length<=1) return true;

        for(int i=0;i<nums.length;i++){
            if(i>maxi)
                    return false;
            maxi=Math.max(maxi,i+nums[i]);
        }
        return true;
    }
}