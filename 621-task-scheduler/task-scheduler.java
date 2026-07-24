class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        Arrays.sort(freq);

        int gadhdhe = freq[25] - 1;
        int empty = gadhdhe * n;

        for (int i = 24; i >= 0; i--) {
            empty -= Math.min(freq[i], gadhdhe);
        }

        if (empty < 0)
            empty = 0;

        return tasks.length + empty;
    }
}