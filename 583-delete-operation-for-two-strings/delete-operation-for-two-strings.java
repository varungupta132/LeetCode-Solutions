class Solution {
    public int minDistance(String w1, String w2) {
        int[][] dp = new int[w1.length()][w2.length()];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
        return solve(w1 , 0 , w2 , 0 , dp);
    }
    public int solve(String s1 , int a , String s2 ,int b ,  int[][] dp){

        if(a >= s1.length()){
            return s2.length() - b ;
        }
        if(b >= s2.length()){
            return s1.length() - a ;
        }

        // if(a >= s1.length() || b >= s2.length()) return 0;


        if(dp[a][b] != -1){
            return dp[a][b];
        }   
        else{
            if(s1.charAt(a) == s2.charAt(b)){
                dp[a][b] = solve(s1 , a+1 , s2 , b+1 , dp);
            }
            else{
                dp[a][b] = Math.min(solve(s1 , a , s2 , b+1 , dp) , solve(s1 , a+1 , s2 , b , dp)) + 1;
            }
        }

        return dp[a][b];
    }
}