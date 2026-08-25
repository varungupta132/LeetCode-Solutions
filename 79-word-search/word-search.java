class Solution {

    public boolean exist(char[][] bo, String wo) {

        boolean[][] u = new boolean[bo.length][bo[0].length];

        int m = bo.length;
        int n = bo[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (bo[i][j] == wo.charAt(0) && do_bhai(bo, wo, i, j, 0, m, n, u)) {
                    return true;
                }
            }
        }

        return false;

        // return do_bhai(bo, wo, 0, 0, 0, m, n, u);
    }

    public boolean do_bhai(char[][] bo, String wo,
                           int i, int j, int idx,
                           int m, int n, boolean[][] u) {

        // Boundary
        if (i >= m || j >= n || i < 0 || j < 0) {
            return false;
        }
        // Current cell already visited
        if (u[i][j]) {
            return false;
        }
        if (bo[i][j] != wo.charAt(idx)) {
            return false;
        }

        // Word complete
        if (idx == wo.length()-1) {
            return true;
        }


        // // Current character doesn't match
        // if (bo[i][j] != wo.charAt(idx)) {
        //     return false;
        // }

        // Mark current cell
        u[i][j] = true;

        boolean ans = false;

        // Down
        ans = ans || do_bhai(
                bo, wo, i + 1, j, idx + 1, m, n, u
        );

        // Up
        ans = ans || do_bhai(
                bo, wo, i - 1, j, idx + 1, m, n, u
        );

        // Right
        ans = ans || do_bhai(
                bo, wo, i, j + 1, idx + 1, m, n, u
        );

        // Left
        ans = ans || do_bhai(
                bo, wo, i, j - 1, idx + 1, m, n, u
        );

        // Backtrack
        u[i][j] = false;

        return ans;
    }
}