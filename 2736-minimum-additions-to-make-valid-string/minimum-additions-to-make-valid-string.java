class Solution {
    public int addMinimum(String word) {
        int g = 1;
        for(int i = 1 ; i < word.length() ; i++){
            if(word.charAt(i-1) >= word.charAt(i)){
                g++;
            }
        }
        return g*3 - word.length();
    }
}