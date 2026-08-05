class Solution {
    public int numberOfPermutations(int n, int[][] requirements) {
        final int MOD = 1_000_000_007;
        int MAX = 400;
        int[] req = new int[n];
        Arrays.fill(req, -1);
        for (int[] r : requirements)
            req[r[0]] = r[1];
        if (req[0] > 0)
            return 0;
        long[][] dp = new long[n][MAX + 1];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            for (int inv = 0; inv <= MAX; inv++) {
             long ways = 0;
                for (int add = 0; add <= Math.min(i, inv); add++) {
                    ways += dp[i - 1][inv - add];
                    ways %= MOD;
                }
                dp[i][inv] = ways;
            }
            if (req[i] != -1) {
                for (int inv = 0; inv <= MAX; inv++) {
                    if (inv != req[i])
                        dp[i][inv] = 0;
                }
            }
        }
        return (int) dp[n - 1][req[n - 1]];
    }
}