class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int size = n * m;

        // Step 1: flatten (with mod to avoid overflow)
        int[] arr = new int[size];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[k++] = grid[i][j] % 12345;
            }
        }

        // Step 2: prefix
        int[] pref = new int[size];
        pref[0] = 1;
        for (int i = 1; i < size; i++) {
            pref[i] = (pref[i - 1] * arr[i - 1]) % 12345;
        }

        // Step 3: suffix
        int[] suf = new int[size];
        suf[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            suf[i] = (suf[i + 1] * arr[i + 1]) % 12345;
        }

        // Step 4: build answer
        int[][] ans = new int[n][m];
        for (int i = 0; i < size; i++) {
            int val = (pref[i] * suf[i]) % 12345;
            ans[i / m][i % m] = val;
        }

        return ans;
    }
}