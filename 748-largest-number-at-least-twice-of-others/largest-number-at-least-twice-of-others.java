class Solution {
    public int dominantIndex(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
        // int ansdx = nums[nums.length -1];

        // for(int i = 0 ; i < nums.length)

        int ans= Integer.MIN_VALUE;
        if(nums[nums.length-1] >= 2* nums[nums.length-2]) ans = nums[nums.length-1];
        for(int i = 0 ; i < copy.length ; i++){
            if(copy[i] == ans) return i;
        }
        return -1;
    }
}