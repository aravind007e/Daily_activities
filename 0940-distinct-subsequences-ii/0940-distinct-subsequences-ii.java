class Solution {
    public int distinctSubseqII(String s) {
        int mod=1_000_000_007;
        long[] dp=new long[26];
        long ans=0;
        for(char i:s.toCharArray()){
            int ind=i-'a';
            long n=(ans+1)%mod;
            ans=(ans+n-dp[ind]+mod) % mod;
            dp[ind]=n;
        }

    return (int) ans;
    }
}