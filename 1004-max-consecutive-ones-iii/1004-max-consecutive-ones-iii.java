class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxi=0;
        int count=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
            while(count>k){
                if(nums[start]==0) count--;
                start++;
            }
            maxi=Math.max(maxi,i-start+1);
        }
        return maxi;
    }
}