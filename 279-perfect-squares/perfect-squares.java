class Solution {
    int[] dp ;
    public int numSquares(int n) {
        
        // if( n == 4 || n == 9 || n == 16 || n ==1) return 1;
        // if(n == 0) return 0;
        // int ans = Integer.MAX_VALUE;
        dp = new int[n+1];
        Arrays.fill(dp , -1);


        // for(int i = 1 ; i*i <= n ; i++){
        //     if(dp[n-i*i] == -1){
        //     dp[n-i*i] = solve(n-i*i);
        //     } 
        //     // else
        //     ans = Math.min(1+dp[n-i*i] , ans);
        // }
        return solve(n);
    }
    int solve(int n ){

        if( n == 4 || n == 9 || n == 16 || n ==1) return 1;
        if(n == 0) return 0;
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = Integer.MAX_VALUE;

        for(int i = 1 ; i*i <= n ; i++){
            if(dp[n-i*i] == -1){
             dp[n-i*i] = solve(n-i*i);
            } 
            // else
            ans = Math.min(1+dp[n-i*i] , ans);
            
        }
        return dp[n] = ans;
        
    }
}