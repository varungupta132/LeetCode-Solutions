class Solution {
    public int getMinDistance(int[] nums, int ta, int st) {
        int c  = Integer.MAX_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == ta){
                c = Math.min ( c ,   Math.abs(st - i));
            }
        }
        return c;

    }
}