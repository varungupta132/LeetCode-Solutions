class Solution {
    public boolean uniformArray(int[] nums1) {
        int minod = Integer.MAX_VALUE;

        for(int i : nums1){
            if( i % 2 != 0 && minod > i ){
                minod = i;
            }
        }
        if(minod == Integer.MAX_VALUE) return true;

        for(int i : nums1){
            if(i%2 == 0 && i <= minod) return false;
        }
        return true;
    }
}