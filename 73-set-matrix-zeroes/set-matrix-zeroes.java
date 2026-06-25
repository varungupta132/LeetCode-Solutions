class Solution {
    public void setZeroes(int[][] ma) {

        int m = ma.length;
        int n = ma[0].length;

        ArrayList<int[]> arr = new ArrayList<>();

        // Step 1: store all zero positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ma[i][j] == 0) {
                    arr.add(new int[]{i, j});
                }
            }
        }

        // Step 2: mark rows and cols using arrays (OPTIMIZATION)
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int[] x : arr) {
            row[x[0]] = true;
            col[x[1]] = true;
        }

        // Step 3: apply once
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    ma[i][j] = 0;
                }
            }
        }
    }
}