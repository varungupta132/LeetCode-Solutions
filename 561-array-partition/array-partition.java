class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0 ;
        Arrays.sort(nums);
        for(int i = nums.length -2 ; i >= 0 ; i = i - 2){
            // System.out.println("value of i is -> " + i + " nums[i] ==> " + nums[i]);
            sum += nums[i];
        }
        return sum;
    }
}