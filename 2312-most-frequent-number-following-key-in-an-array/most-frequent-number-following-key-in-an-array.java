class Solution {
    public int mostFrequent(int[] nums, int key) {
            HashMap<Integer, Integer > hm = new HashMap<>();

        for(int i = 0 ;i<  nums.length -1; i++){
            if(nums[i] == key){
                hm.put(nums[i+1], hm.getOrDefault(nums[i+1], 0) + 1);
            }
        }
        int maxKey = -1;
int maxValue = Integer.MIN_VALUE;

for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
    int ke = entry.getKey();
    int value = entry.getValue();

    if(value > maxValue){
        maxValue = value;
        maxKey = ke;
    }
}


return maxKey;
    }
}