class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean []ans=new boolean[n];

        for(int i=2;i<n;i++){
            ans[i]=true;
        }

        int count=0;
        for(int i=2;i*i<n;i++){
            if(ans[i]){
                for(int j=i*i;j<n;j+=i){
                   ans[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(ans[i]) count++;
        }
        return count;
    }
}