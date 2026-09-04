class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        if(n==1){
            if(nums[0]<=k) return 0;
        }
        
        for(int i=0;i<n;i++){
          int max=0;
          int min=Integer.MAX_VALUE;
          for(int j=0;j<=i;j++){
            if(max<nums[j]) max=nums[j];
          }
          for(int j=i;j<n;j++){
            if(min>nums[j]) min=nums[j];
          }
          int sum=max-min;
          if(sum<=k) return i;

        }
        return -1;
    }
}