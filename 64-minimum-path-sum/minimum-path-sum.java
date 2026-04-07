class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        // Initialize dp with -1 to mark uncomputed cells
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return minCost(0, 0, grid, dp);
    }

    private int minCost(int i, int j, int[][] grid, int[][] dp) {
        int m = grid.length;
        int n = grid[0].length;

        // Out of bounds
        if (i >= m || j >= n) return Integer.MAX_VALUE;

        // Bottom-right cell
        if (i == m - 1 && j == n - 1) return grid[i][j];

        // Already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Move right or down
        int right = minCost(i, j + 1, grid, dp);
        int down = minCost(i + 1, j, grid, dp);

        // Save in dp
        dp[i][j] = grid[i][j] + Math.min(right, down);
        return dp[i][j];
    }
}