class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0 ;
        // int i = 0;
        // int j = 0;

        for(int i = m ; i < nums1.length ; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);




    }
}