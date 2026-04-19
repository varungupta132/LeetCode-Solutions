class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int  c = 0;
        for(int i = 0 ; i < nums1.length ; i++){
            int l = i ;
            int r = nums2.length-1 ;
            while( l <= r){
                int mid = l + (r - l)/2;
                if(nums1[i] <= nums2[mid] && i <= mid){
                    c = Math.max(c , (mid-i));
                    l= mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
        return c;
    }
}