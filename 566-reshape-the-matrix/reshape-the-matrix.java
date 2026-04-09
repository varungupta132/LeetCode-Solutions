class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // ✅ check possible or not
        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];

        int ridx = 0;
        int cidx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                ans[ridx][cidx] = mat[i][j];  // ✅ pehle fill karo
                cidx++;

                if (cidx == c) {   // ✅ baad me move karo
                    cidx = 0;
                    ridx++;
                }
            }
        }

        return ans;
    }
}