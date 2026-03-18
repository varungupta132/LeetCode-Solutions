class Solution {
    public int sumOfUnique(int[] nums) {
        int sumy = 0;
        int freq[] = new int[101];

        for(int i : nums){
            freq[i]++;
        }

        for(int i = 0; i <= 100; i++){
            if(freq[i] == 1){
                sumy += i;
            }
        }
        return sumy;
    }
}