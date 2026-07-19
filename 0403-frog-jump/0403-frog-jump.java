class Solution {

    private Map<Integer, Integer> map = new HashMap<>();
    private Boolean[][] memo;

    public boolean canCross(int[] stones) {

        int n = stones.length;

        // Position -> Index
        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        memo = new Boolean[n][n + 1];

        return dfs(stones, 0, 0);
    }

    private boolean dfs(int[] stones, int index, int lastJump) {

        if (index == stones.length - 1)
            return true;

        if (memo[index][lastJump] != null)
            return memo[index][lastJump];

        for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {

            if (jump <= 0)
                continue;

            int nextPosition = stones[index] + jump;

            if (map.containsKey(nextPosition)) {

                int nextIndex = map.get(nextPosition);

                if (dfs(stones, nextIndex, jump)) {
                    return memo[index][lastJump] = true;
                }
            }
        }

        return memo[index][lastJump] = false;
    }

}