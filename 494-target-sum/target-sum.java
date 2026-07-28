class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums , target , 0 );
    }
    int solve(int[] nums , int t , int idx){
        // if(t == 0) return 1;
        // if(t < 0 ) return 0;
        if(idx == nums.length) return (t == 0) ? 1 : 0;

        return solve(nums , t - nums[idx] , idx + 1) + solve(nums , t + nums[idx] , idx + 1);  
    }
}