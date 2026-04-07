class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        for(int i = 0 ; i < m ; i++){
            dp[i][n-1] = 1;
        }
        for(int i = 0 ; i < n ; i++){
            dp[m-1][i] = 1;
        }
        // dp[m-1][n-1] = 0;
        return help(dp , 0 , 0 );
    }
    public int help(int[][] dp , int m , int n){
        if(m >= dp.length || n >= dp[0].length) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        dp[m][n] = help(dp , m+1 , n ) + help(dp , m , n+1 ) ;

        return dp[m][n];
    }
}