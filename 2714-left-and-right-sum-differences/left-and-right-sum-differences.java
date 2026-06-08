class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0;
        int right=0;
        int[]leftsum=new int[nums.length];
        int[]rightsum=new int[nums.length];
        int[]ans=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            left+=nums[i-1];
            leftsum[i]=left;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right += nums[i + 1];
            rightsum[i] = right;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
        
    }
}