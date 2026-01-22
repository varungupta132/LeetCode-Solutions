class Solution {
    public long subArrayRanges(int[] nums) {
        long c = 0 ;
        for (int i = 0; i < nums.length; i++) {
    int minVal = nums[i], maxVal = nums[i];
    for (int j = i; j < nums.length; j++) {
        minVal = Math.min(minVal, nums[j]);
        maxVal = Math.max(maxVal, nums[j]);
        c += (long)(maxVal - minVal);
    }
}
return c;
    }
}