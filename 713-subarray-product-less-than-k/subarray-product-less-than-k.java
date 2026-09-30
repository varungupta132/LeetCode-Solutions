class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p = 1;
        int l  = 0 ;
        int c  = 0 ;
        if (k <= 1) return 0;
        for(int r = 0 ; r < nums.length ; r++){
            p = p * nums[r];
            while(p >= k ){
                p = p / nums[l] ;
                // if(p < k) c++;
                
                l++;
            }
            c += r - l + 1;
        }
        return c;
    }
}