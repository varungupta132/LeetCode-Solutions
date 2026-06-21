class Solution {
    public int maxProduct(int[] nums) {
        int maxi = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            int curr = nums[i];
            maxi = Math.max(maxi , curr);

            for(int j = i+1 ; j < nums.length ; j++){
                // if(nums[j] <0) break;
                curr = curr * nums[j];
                maxi = Math.max(maxi , curr);
            }
                        // maxi = Math.max(maxi , curr);

                // System.out.println("Maxi -->" + maxi);

        }
        return maxi;
    }
}