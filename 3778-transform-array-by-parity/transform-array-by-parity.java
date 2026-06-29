class Solution {
    public int[] transformArray(int[] nums) {
        int e = 0;
        int o = 0;
        for(int i : nums){
            if(i % 2 == 0){
                e++;
            }
            else{
                o++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(e > 0){
                nums[i] = 0;
                e--;
            }
            else{
                nums[i] = 1;
            }
        }
        return nums;
    }
}