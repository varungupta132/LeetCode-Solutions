class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length < 4) return false;
        for(int i = 1 ; i < nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                if( si( 0 , i , nums) && sd(i , j , nums) && si(j , nums.length-1 , nums)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean si(int s , int e, int[] nums){
        for(int i = s+1 ; i <= e ; i++){
            if(nums[i-1] >= nums[i]){
                return false;
            }
        }
        return true;
    }
    public boolean sd(int s , int e, int[] nums){
        for(int i = s+1 ; i <= e ; i++){
            if(nums[i-1] <= nums[i]){
                return false;
            }
        }
        return true;
    }
    
}