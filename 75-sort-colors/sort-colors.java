class Solution {
    public void sortColors(int[] nums) {
        int idx = 0 ;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == i){
                    int te = nums[idx];
                    nums[idx++] = nums[j];
                    nums[j] = te;
                }
            }
        }
        
    }
}