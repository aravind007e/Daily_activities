class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        boolean check=true;
        for(int i=1;i<n;i++){
            int diff=nums[i]-nums[i-1];
            if(ans==0 && diff<0) check=false;
            if(check && diff>0){
                ans++;
                check=false;
            }
            else if(!check && diff<0){
                ans++;
                check=true;
            }
        }
        return ans+1;
    }
}