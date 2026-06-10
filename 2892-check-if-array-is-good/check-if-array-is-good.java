class Solution {
    public boolean isGood(int[] nums) {
                if(nums.length < 2) return false;

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] != i+1) return false;
        }
        if(nums[nums.length-1] != nums[nums.length-2]) return false;


        return true;
    }
}