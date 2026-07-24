class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = nums.length -1 ; i>= 0 ;i--){
            if(i == nums.length-1) dp[i]=0;
            else{
                int mini  = 9999999 ;
                for(int j = i+1 ; (j-1) < i+nums[i] && j< nums.length ; j++ ){
                    mini = Math.min(mini , dp[j]);
                }
                dp[i] = mini+1;
            }
        }
        return dp[0];
    }
}