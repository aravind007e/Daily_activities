class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            h.put(nums[right],h.getOrDefault(nums[right],0)+1);

            while(h.get(nums[right])>k){
                h.put(nums[left],h.get(nums[left])-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}