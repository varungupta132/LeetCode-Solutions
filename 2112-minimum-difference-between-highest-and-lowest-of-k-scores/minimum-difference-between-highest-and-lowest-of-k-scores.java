class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length ==1) return 0;
        int min = Integer.MAX_VALUE ;

        for(int i = 0 ; i < nums.length-k+1 ;i++){
            min = Math.min(min ,Math.abs( nums[i] - nums[i+k-1]));
        }
return min;


        
        }
}