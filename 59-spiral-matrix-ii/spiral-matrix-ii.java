class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int idx = 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int j = left; j <= right; j++) {
                ans[top][j] = idx++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = idx++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = idx++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = idx++;
                }
                left++;
            }
        }

        return ans;
    }
}