class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int idx = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> xyz : hm.entrySet()){
            if(xyz.getValue() == 1){
                ans[idx++] = xyz.getKey();
            }
        }
        return ans;

    }
}