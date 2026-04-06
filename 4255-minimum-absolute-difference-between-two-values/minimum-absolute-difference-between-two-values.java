class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int maxi = Integer.MAX_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == 1 && nums[j] == 2){
                    maxi = Math.min(maxi , Math.abs(i-j));
                }
            }
        }
        return maxi == Integer.MAX_VALUE? -1 : maxi;
    }
}