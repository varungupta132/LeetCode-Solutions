class Solution {
    public boolean isArraySpecial(int[] nums) {
        // for(int i = 0 ; i < nums.length ; i++){
        //     boolean e = false;
        //     boolean o = false;
        //     for(int j = 0 ; j < nums.length ; j++){
        //         if(j % 2 == 0) e = true;
        //         else o = true;
        //         if(e && o)return true;
        //     }
        // }

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] %2 == 0 && nums[i] %2 == 0) return false;
            if(nums[i-1] %2 != 0 && nums[i] %2 != 0) return false;
        }
        return true;
    }
}