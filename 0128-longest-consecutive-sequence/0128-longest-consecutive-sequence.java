class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int maxi=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])==1){
                count++;
            }
            else if(nums[i]==nums[i+1]) continue;
            else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi+1;
    }
}