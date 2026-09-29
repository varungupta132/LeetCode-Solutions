class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int c = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if( i == 0){
                idx++;
                c++;
            }
            else{
                if(nums[i] != nums[i-1]){
                    // int temp = nums[idx];
                    c++;
                    nums[idx] = nums[i];
                    idx++;
                }
            }
        }
        return c;
    }
}