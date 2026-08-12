class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , i);
        }

        for(int i = 0 ; i < nums.length ; i++){
            int rest =  t - nums[i];
            if(   hm.getOrDefault(rest , -1)   != -1  && hm.getOrDefault(rest , -1) != i ){
                int v = hm.get(rest);
                return new int[]{i , v};
            }
        }

        return new int[]{-1 , -1};
    }
}