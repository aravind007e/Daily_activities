class Solution {
    public int nthUglyNumber(int n) {
        int [] ans=new int[n];
        ans[0]=1;
        int a2=0;
        int b3=0;
        int c5=0;

        for(int i=1;i<n;i++){
            int n2=ans[a2]*2;
            int n3=ans[b3]*3;
            int n5=ans[c5]*5;

            ans[i]=Math.min(n2,Math.min(n3,n5));

            if(ans[i]==n2) a2++;
            if(ans[i]==n3) b3++;
            if(ans[i]==n5) c5++;
        }
        return ans[n-1];
    }
}