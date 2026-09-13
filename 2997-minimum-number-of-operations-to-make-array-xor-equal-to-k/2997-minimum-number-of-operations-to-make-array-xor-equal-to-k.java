class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return Integer.bitCount(xor^k);
    }
}