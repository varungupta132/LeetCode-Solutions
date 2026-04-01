class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100001];
        int maxi = Integer.MIN_VALUE ;
        for(int i : nums){
            if(i %2 == 0){
                freq[i]++;
                maxi = Math.max(maxi , freq[i]);
            }
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == maxi) return i;
        }
        return -1;
    }
}