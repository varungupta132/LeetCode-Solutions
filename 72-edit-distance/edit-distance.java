class Solution {
    public int minDistance(String w1, String w2) {
        int[][] dp = new int[w1.length() ][w2.length()];
        for(int[] x: dp){
            Arrays.fill(x , -1);
        }


        return solve(w1 , 0 , w2 , 0  , dp);
    }
    public int solve(String w1 , int i , String w2 , int j , int[][] dp){
        // if( i >= w1.length() || j >= w2.length()) return 0;

        if(i >= w1.length()){
            return (w2.length() - j);
        // // return Math.abs(j-i);
        }
        
        if(j >= w2.length()){
             return w1.length()-i;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        else{
            // dp[i][j]
            if(w1.charAt(i) == w2.charAt(j)){
                return  dp[i][j] = solve(w1 , i+1 , w2 , j+1 , dp) ;
            }
            else{
                // return Math.min(solve(w1 , i+1 , w2 , j , c+1) , solve(w1 , i , w2 , j+1 , c+1));
                return dp[i][j] = 1 +Math.min(
                solve(w1 , i+1 , w2 , j  , dp),
                Math.min(solve(w1 , i , w2 , j+1  , dp),
                solve(w1 , i+1 , w2 , j+1 , dp )));
            }
        }
        }

}