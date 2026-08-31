class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int idx = 1;
        while(true){
            if(!hs.contains(k*idx)) return k*idx ;
            idx++;
        }
    }
}