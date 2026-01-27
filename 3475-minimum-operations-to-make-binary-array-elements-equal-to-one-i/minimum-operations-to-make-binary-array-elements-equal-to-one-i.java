class Solution {
    public int minOperations(int[] nums) {
        int s = 0;
        int e = s+3;
        int cc = 0;
        for(int i = 0 ; i <= nums.length-3; i++){
            if(nums[i] == 0){
                // flip-------->
                for(int j = i ; j < i+3 ; j++){
                    if(nums[j] == 0){
                        nums[j] = 1;
                    }
                    else nums[j] = 0;
                } 
            cc++;
            }
        }
        if(nums[nums.length -1] == 0 || nums[nums.length -2] == 0  ) return -1;
        return cc;
    }
}