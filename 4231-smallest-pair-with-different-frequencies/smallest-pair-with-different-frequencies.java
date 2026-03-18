class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq = new int[101];

        // count frequency
        for(int i : nums){
            freq[i]++;
        }

        // collect unique numbers
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            if(freq[i] > 0){
                list.add(i);
            }
        }

        // compare only unique elements
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                int a = list.get(i);
                int b = list.get(j);

                if(freq[a] != freq[b]){
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{-1, -1};
    }
}