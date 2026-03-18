class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Arrays.sort(nums);
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        for(int i = 0 ; i< nums.length ;i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] < nums[j] && freq[nums[i]] != freq[nums[j]]){
                    return new int[]{nums[i] , nums[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
}