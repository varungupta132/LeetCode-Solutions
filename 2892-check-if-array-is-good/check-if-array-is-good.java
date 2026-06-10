class Solution {
    public boolean isGood(int[] nums) {

        if(nums.length < 2) return false;

        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] != i + 1){
                return false;
            }
        }

        if(nums[n - 1] != nums[n - 2]){
            return false;
        }

        return true;
    }
}