class Solution {
    public int longestSubsequence(int[] nums) {
        int num=nums.length;
        int x=0;
        boolean zero=false;

        for(int i:nums){
            x^=i;

            if(i!=0){
                zero=true;
            }
        }
        if(x!=0) return num;
        if(zero) return num-1;
        return 0;
    }
}