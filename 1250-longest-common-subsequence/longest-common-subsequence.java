class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp = new int[t1.length()][t2.length()];
        for(int[] x : dp ){
            Arrays.fill(x , -1);
        }
        return solve(t1 , t2 , 0 , 0 , 0 , dp);
    }
    public int solve(String t1 , String t2 , int i , int j , int c , int[][] dp){
        if(t1.length()-1 <  i || t2.length()-1 < j){
            return 0;
        }
        // if(t1.length()-1 == i && t2.length()-1 == j){
        //     return dp[i][j];
        // }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(t1.charAt(i) == t2.charAt(j)){
           dp[i][j] = solve(t1 , t2 , i+1 , j+1 , c ,dp) + 1;
        }
        else
        dp[i][j] = (int)Math.max(solve(t1 , t2 , i+1 , j , c , dp)  , solve(t1 , t2 , i , j+1 , c , dp )) ;

        return dp[i][j];
    }
}