class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp , -1);
        dp[0] = 0;
        int x = solve(nums , target , dp );
        System.out.println(Arrays.toString(dp));
        return x;
    }
    public int solve(int[] nums , int t , int[] dp ){
        if(t == 0) return 1;
        if(t < 0) return 0; 
        if(dp[t ] != -1) return dp[t];
        dp[t] = 0;
        for(int i : nums){
            dp[t] += solve(nums , t - i , dp );
        }
        return dp[t];
    }
}