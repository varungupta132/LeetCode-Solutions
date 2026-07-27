class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[][] dp  = new int[s.length()+1][s.length()+1];
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        return solve( s , sb.reverse().toString() , 1 , 1  , dp);
   }
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp  = new int[t1.length()+1][t2.length()+1];
        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        return solve(t1 , t2 , 1 , 1  , dp);
    }
    public int solve(String t1 , String t2 , int i , int j , int[][] dp){
        if( i > t1.length() || j > t2.length()){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(i == 0 || j == 0){
            dp[i][j] = 0;
            return 0;
        }
        else{
            if(t1.charAt(i-1) == t2.charAt(j-1)){
                dp[i][j] = solve(t1 , t2 , i+1 , j+1  , dp) + 1;
            }else{
                dp[i][j] = Math.max(solve(t1 , t2 , i+1 , j  , dp) , solve(t1 , t2 , i , j+1  , dp));
            }
        }
        return dp[i][j];
    }
}