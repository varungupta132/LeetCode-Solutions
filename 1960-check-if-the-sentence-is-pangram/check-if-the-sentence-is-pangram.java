class Solution {
    public boolean checkIfPangram(String se) {
        int[] freq = new int[26];

        for(int i = 0 ; i < se.length() ; i++){
            int nn = se.charAt(i) - 'a';
            freq[nn]++;
        }
        for(int i : freq){
            if(i == 0) return false;
        }
        return true;
    }
}