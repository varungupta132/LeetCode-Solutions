class Solution {
    public String reorganizeString(String s) {

        int n = s.length();
        int[] freq = new int[26];

        int maxFreq = 0;
        int maxChar = 0;

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;

            if (freq[ch - 'a'] > maxFreq) {
                maxFreq = freq[ch - 'a'];
                maxChar = ch - 'a';
            }
        }

        if (maxFreq > (n + 1) / 2) {
            return "";
        }

        char[] ans = new char[n];
        int idx = 0;

        // Place most frequent character first
        while (freq[maxChar] > 0) {
            ans[idx] = (char) (maxChar + 'a');
            idx += 2;
            freq[maxChar]--;
        }

        // Place remaining characters
        for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {

                if (idx >= n) {
                    idx = 1;
                }

                ans[idx] = (char) (i + 'a');
                idx += 2;
                freq[i]--;
            }
        }

        return new String(ans);
    }
}