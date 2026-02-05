class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int t = i;
            if(nums[i] > 0 ){
                t = (t + nums[i])%nums.length;
                res[i] = nums[t];
            }
            else if(nums[i]<0){
                int curr=(i+nums[i])%nums.length;
                if(curr<0){
                    curr+= nums.length;
                }
                res[i]=nums[curr];
            }
            else if(nums[i] == 0){
                res[i] = nums[i];
            }
        }
        return res;
    }
}