class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <=1) return true;
        int maxi = 0 ;
        int i = 0;
        while( i <= maxi){
            maxi = Math.max(maxi , i + nums[i]);
            System.out.println(maxi);
                // System.out.println(nums.length);
            if(maxi >= nums.length-1){
                return true;
            }
            // if(maxi == 0) return false;
            i++;
        }
        return false;
    }
}