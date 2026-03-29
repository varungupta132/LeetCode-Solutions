class Solution {
    public int findFinalValue(int[] nums, int ori) {
        while(true){
            boolean f = false;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == ori ){
                    f = true;
                    break;
                }
            }
            if(f) ori *= 2;
            else return ori;
        }
    }
}