class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int ele = nums[i];
            for(int j = i ; j < nums.length ;j++){
                if(Math.abs(ele - nums[j]) == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}