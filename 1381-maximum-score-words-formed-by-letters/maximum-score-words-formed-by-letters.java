import java.util.*;

class Solution {

    int max = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        // 1. Allowed letters ki frequency
        int[] allowed = new int[26];

        for (char ch : letters) {
            allowed[ch - 'a']++;
        }

        // 2. Sirf individually valid words store karo
        ArrayList<String> arr = new ArrayList<>();

        for (String word : words) {

            int[] freq = new int[26];
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;

                if (freq[ch - 'a'] > allowed[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                arr.add(word);
            }
        }

        // 3. Valid words ke combinations check karo
        bt(arr, 0, allowed, score, 0);

        return max;
    }

    void bt(ArrayList<String> arr, int idx,
            int[] allowed, int[] score, int currScore) {

        max = Math.max(max, currScore);

        for (int i = idx; i < arr.size(); i++) {

            String word = arr.get(i);

            int[] freq = new int[26];
            boolean valid = true;

            // word ki frequency
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;

                if (freq[ch - 'a'] > allowed[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            // agar word valid nahi hai
            if (!valid)
                continue;

            // allowed frequency se minus
            for (int j = 0; j < 26; j++) {
                allowed[j] -= freq[j];
            }

            // word ka score
            int wordScore = 0;

            for (char ch : word.toCharArray()) {
                wordScore += score[ch - 'a'];
            }

            // next words ke saath combination
            bt(arr, i + 1, allowed, score, currScore + wordScore);

            // backtrack -> frequency wapas
            for (int j = 0; j < 26; j++) {
                allowed[j] += freq[j];
            }
        }
    }
}