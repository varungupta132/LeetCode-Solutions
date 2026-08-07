class Solution {

    public int maximalSquare(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        int maxSide = 0;

        // Bottom-right -> Top-left
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                // Current cell is 1
                if (matrix[i][j] == '1') {

                    // Last row or last column
                    if (i == m - 1 || j == n - 1) {
                        dp[i][j] = 1;
                    }

                    else {
                        int right = dp[i][j + 1];
                        int down = dp[i + 1][j];
                        int diagonal = dp[i + 1][j + 1];

                        dp[i][j] = 1 + Math.min(
                                right,
                                Math.min(down, diagonal)
                        );
                    }

                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide;
    }
}