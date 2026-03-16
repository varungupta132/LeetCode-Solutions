class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(freq.get(num)==1 && num%2 ==0){
                return num;
            }
        }
        return -1;
    }
}