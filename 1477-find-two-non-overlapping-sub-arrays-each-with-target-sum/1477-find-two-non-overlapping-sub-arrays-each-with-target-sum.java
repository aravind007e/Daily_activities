class Solution {
    public int minSumOfLengths(int[] arr, int target){
        int n=arr.length;
        int N=1000000;
        int[] best=new int[n];
        for(int i=0;i<n;i++){
            best[i]=N;  
        }
        int left=0;
        int sum=0;
        int ans=N;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                int len=right-left+1;
                if(left>0 && best[left-1]!=N){
                    ans=Math.min(ans,len+best[left-1]);
                }
                if(right==0) best[right]=len;
                else best[right]=Math.min(best[right-1],len);
            }
            else if(right>0) best[right]=best[right-1];

        }
        return ans==N? -1:ans;

    }
}