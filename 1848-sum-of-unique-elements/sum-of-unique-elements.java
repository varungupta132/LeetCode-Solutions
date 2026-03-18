class Solution {
    public int sumOfUnique(int[] nums) {
        int s = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
        }

        for(int i : nums){
            if(hm.get(i) == 1){
                s+= i;
            }
        }
        return s;
    }
}