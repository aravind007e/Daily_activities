class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int ans=-1;
        for(int h:nums){
            int count=0;
            for(int i=0;i<=n-k;i++){
                boolean f=false;
                for(int j=i;j<i+k;j++){
                    if(nums[j]==h){
                        f=true;
                        break;
                    }
                }
                if(f) count++;
            }
            if(count==1) ans=Math.max(ans,h);
        }    
        return ans;    
    }
}