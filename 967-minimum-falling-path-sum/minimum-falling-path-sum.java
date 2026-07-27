class Solution {
    public int minFallingPathSum(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        for(int i = mat.length-1 ; i >= 0 ; i--){
            for(int j = mat[0].length-1 ; j >= 0 ; j--){
                if(i == mat.length -1){
                    dp[i][j] = mat[i][j];
                }
                else if(j == 0){
                    dp[i][j] = mat[i][j] + Math.min(dp[i+1][j] , dp[i+1][j+1]);
                }
                else if(j == mat.length-1){
                    dp[i][j] = mat[i][j] + Math.min(dp[i+1][j] , dp[i+1][j-1]);
                }
                else{
                    dp[i][j] = mat[i][j] + Math.min(Math.min(dp[i+1][j] , dp[i+1][j+1]) , dp[i+1][j-1] ) ;
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < mat[0].length ; i++){
            ans = Math.min(dp[0][i],ans);
        }
        System.out.println(Arrays.deepToString(dp));

        return ans;
    }
}