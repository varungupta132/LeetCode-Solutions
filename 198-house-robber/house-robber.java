class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        // dp[nums.length -1] = nums[nums -1];
        int[] dp = new int[nums.length +1 ];
        // Arrays.fill(dp , -1);
        // return solve(nums , dp , 0);

        for(int i = 1 ;  i < dp.length ; i++){
            int x = nums[i-1];
            if(i-2 >0){
                dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i-1]);
            }
            else{
                dp[i] = Math.max(dp[i-1] , nums[i-1]);
            }
        }
        return dp[dp.length -1 ];
        
    }

    // public int solve(int[] nums , int[] dp , int idx){
    //     if(idx == nums.length-1) return nums[nums.length-1];
    //     if(idx == nums.length-2) return Math.max(nums[nums.length-2] , nums[nums.length-1]) ;
    //     if(dp[idx] != -1) return dp[idx];
    //     dp[idx] =Math.max( nums[idx] + solve(nums,  dp , idx + 2 ) ,solve(nums, dp , idx + 1 ));
    //     return dp[idx]; 
    // }
}