class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans , -1);
        for(int k = 0 ; k < nums1.length ; k++){
            int ele = nums1[k];
            for(int i = 0; i < nums2.length ; i++){
                if(ele == nums2[i])
                for(int j = i+1 ; j < nums2.length ; j++){
                    if(nums2[i] < nums2[j]){
                        ans[k] = nums2[j];
                        break;
                    }
                }
            }
        }
        return ans;
    }
}