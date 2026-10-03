class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int[] dp = new int[nums.length];
        for(int i = nums.length-2 ; i >= 0 ; i--){
            int mini = Integer.MAX_VALUE-1;
            for(int j = i+1 ; j < nums.length && j <= i + nums[i]; j++ ){
                // if(j == nums.length -1){
                //     mini = 0;
                // }
                // else{
                    mini = Math.min(mini , dp[j]);
                // }
            }
            // if(mini != Integer.MAX_VALUE)
            dp[i] = mini+1;
            // else
            // dp[i] = 0;
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}