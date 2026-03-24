class Solution {
    public boolean uniformArray(int[] nums1) {
        int maxod = Integer.MAX_VALUE;

        for(int i : nums1){
            if( i % 2 != 0 && maxod > i ){
                maxod = i;
            }
        }
        if(maxod == Integer.MAX_VALUE) return true;

        for(int i : nums1){
            if(i%2 == 0 && i <= maxod) return false;
        }
        return true;
    }
}