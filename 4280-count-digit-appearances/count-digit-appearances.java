class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for(int i : nums){
            while(i > 0){
                int rem = i % 10;
                if(rem == digit) c++;
                i = i / 10;
            }
        }
        return c;
    }
}