class Solution {
    public int rob(int[] nums) {
                if(nums.length == 1) return nums[0];

        int[] dpf = new int[nums.length -1];
        Arrays.fill(dpf , -1);
        int[] dpl = new int[nums.length -1];
        Arrays.fill(dpl , -1);
        int[] withoutf = new int[nums.length -1];
            for(int i = 1 ; i < nums.length;i++){
                withoutf[i-1] = nums[i];
            }
        int[] withf = new int[nums.length -1];
            for(int i = 0 ; i < nums.length -1;i++){
                withf[i] = nums[i];
            }

        System.out.println(Arrays.toString(withf));
        System.out.println(Arrays.toString(withoutf));
        // Math.max (solve(wihtoutf , dpf , 0) , solve(wihtf , dpf , 0));
        
        
        return Math.max(solve(withoutf , dpf , 0) , solve(withf , dpl , 0));
    }

        public int solve(int[] nums , int[] dp , int idx){
                if(idx == nums.length-1) return nums[nums.length-1];
                if(idx == nums.length-2) return Math.max(nums[nums.length-2] , nums[nums.length-1]) ;
                if(dp[idx] != -1) return dp[idx];
                dp[idx] =Math.max( nums[idx] + solve(nums,  dp , idx + 2 ) ,solve(nums, dp , idx + 1 ));
                return dp[idx]; 
            }
}