class Solution {
    static int[][] memo;

    static int eggDrop(int n, int k) {
        memo = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++)
            Arrays.fill(memo[i], -1);

        return dp(n, k);
    }

    static int dp(int eggs, int floors) {
        if (floors == 0 || floors == 1 || eggs == 1)
            return floors;

        if (memo[eggs][floors] != -1)
            return memo[eggs][floors];

        int low = 1, high = floors, res = floors;

        while (low <= high) {
            int mid = (low + high) / 2;

            int breaks = dp(eggs - 1, mid - 1);
            int survives = dp(eggs, floors - mid);

            int worst = 1 + Math.max(breaks, survives);

            res = Math.min(res, worst);

            if (breaks > survives)
                high = mid - 1;
            else
                low = mid + 1;
        }

        memo[eggs][floors] = res;
        return res;
    }
}