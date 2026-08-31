class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        int j=k;
        for(int i=0;i<n;i++){
            if(!h.contains(j)) break;
            j+=k;
        }
        return j;
    }
}