class Solution {
    public int findGCD(int[] nums) {
        int m = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;
        for(int i : nums){
            m = Math.min(m , i);
            f = Math.max(f , i);
        }
        int ans = 1;
        for(int i = 2 ; i <= m*f ;i++){
            if(m %i == 0 && f %i == 0){
                // return i;
                ans = i;
            }
        }
        return ans;
    }
}