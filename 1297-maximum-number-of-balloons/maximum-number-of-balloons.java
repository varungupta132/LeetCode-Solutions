class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char ch : text.toCharArray()){
            freq[ch - 'a']++;
        }
        freq['l' - 'a'] /= 2;
        freq['o' - 'a'] /= 2;  
        return Math.min(freq['o' - 'a'] , Math.min(freq['b'- 'a'] , Math.min(freq['a'- 'a'] , Math.min(freq['l'- 'a'] , freq['n'- 'a']  ))) );
    }
}