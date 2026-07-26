class Solution {
    public int change(int am, int[] co) {
        int[] dp = new int[am+1];
        Arrays.fill(dp , 0);
        dp[0] = 1;
        for(int c : co){
            for(int i = c ; i < dp.length ; i++){
                dp[i] += dp[i-c];
            }
        }
        return dp[am];


    }
    public int solve(int am , int[] dp , int[] co){
        if(am == 0){

            dp[am]  = 1;
            return 1;
        }
        // if(am == 1){
        //     dp[am]  = 1;
        //     return 1;
        // }
        if(dp[am] != -1){
            return dp[am];
        }
        
        // if(am == 1)
        dp[am] = solve(am-1,dp , co )+1;
        for(int cc : co){
            if(cc == 1) continue;
            if(am % cc == 0){
                dp[am]++; 
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[am];

    }
}