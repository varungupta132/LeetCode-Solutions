class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add to the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Track the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
