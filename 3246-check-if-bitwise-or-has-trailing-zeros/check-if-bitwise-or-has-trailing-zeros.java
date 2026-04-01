class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c = 0 ;
        for(int i : nums){
            if(i%2 == 0) c++;
        }
        if(c >= 2) return true;
        return false;
    }
}