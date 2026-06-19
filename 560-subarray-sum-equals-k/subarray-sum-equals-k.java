class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int s = nums[i];
            for(int j = i + 1 ; j < nums.length+1 ; j++){
                if(s == k){
                    c++;
                    // break;
                }
                if(j < nums.length)
                s+=nums[j];
            }
        }
        return c;
    }
}