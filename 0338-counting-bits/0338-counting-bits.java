class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int k=i;
            int count=0;
            while(k!=0){
                if((k&1)==1) count++;
                k=k>>1;
            }
            ans[i]=count;
        }
        return ans;
    }
}