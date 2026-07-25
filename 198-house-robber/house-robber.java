class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        // dp[nums.length -1] = nums[nums -1];
        int[] dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return solve(nums , dp , 0);
        
    }

    public int solve(int[] nums , int[] dp , int idx){
        if(idx == nums.length-1) return nums[nums.length-1];
        if(idx == nums.length-2) return Math.max(nums[nums.length-2] , nums[nums.length-1]) ;
        if(dp[idx] != -1) return dp[idx];
        dp[idx] =Math.max( nums[idx] + solve(nums,  dp , idx + 2 ) ,solve(nums, dp , idx + 1 ));
        return dp[idx]; 
    }
}