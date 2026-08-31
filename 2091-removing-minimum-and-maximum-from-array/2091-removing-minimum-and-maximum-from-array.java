class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mini=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxi]) maxi=i;
            if(nums[i]<nums[mini]) mini=i;
        }

        if(mini>maxi){
            int temp=mini;
            mini=maxi;
            maxi=temp;
        }
        int left=maxi+1;
        int right=n-mini;
        int mid=mini+1+(n-maxi);
        return Math.min(left,Math.min(right,mid));
    }
}