class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for(int i : nums){
            int[] temp = dp.clone();
            for(int j = 0 ; j < 3 ; j++){
                int newsum = temp[j] +i;
                dp[newsum%3] = Math.max(newsum , dp[newsum%3]);
            }
        }
        return dp[0];
    }
}