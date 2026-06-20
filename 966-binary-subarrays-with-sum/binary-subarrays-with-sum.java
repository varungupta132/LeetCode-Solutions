class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c =  0;
        for(int i = 0 ; i< nums.length ; i++){
            int s = nums[i];
            for(int j = i + 1 ; j < nums.length+1 ; j++){
                if(s == goal){
                    c++;
                }
                if(s > goal) break;
                if(j < nums.length)
                s+=nums[j];
            }
        }
        return c;
    }
}