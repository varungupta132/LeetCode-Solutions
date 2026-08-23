class Solution {
    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        if(sum % 2 != 0)
            return false;

        int target = sum / 2;
        int n = nums.length;

        boolean[][] dp = new boolean[n][target + 1];

        // Sum 0 is always possible
        for(int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // First element
        if(nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        // Fill table
        for(int i = 1; i < n; i++) {

            for(int t = 1; t <= target; t++) {

                // Don't take nums[i]
                dp[i][t] = dp[i - 1][t];

                // Take nums[i]
                if(nums[i] <= t) {
                    dp[i][t] =
                        dp[i][t] ||
                        dp[i - 1][t - nums[i]];
                }
            }
        }

        return dp[n - 1][target];
    }
}