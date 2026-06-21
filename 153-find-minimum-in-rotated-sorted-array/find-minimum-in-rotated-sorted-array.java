class Solution {
    public int findMin(int[] nums) {
        int l = 0 ;
        int r = nums.length -1 ;
        while(l < r){
            int mid = l + (r - l )/2 ;
            // boolean le = false;
            if(nums[mid] > nums[r]){
                l = mid +1 ;
            }
            else{
                r = mid;

            }
        //     else if(nums[r] > nums[l] && nums[mid] > nums[r]) {
        //         r = mid - 1;
        //     }
        //     else{
        //         return nums[mid];
        //     }
        // }
        }
        return nums[l];
    }
}