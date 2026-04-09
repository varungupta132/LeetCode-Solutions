class Solution {
    public int[][] construct2DArray(int[] or, int m, int n) {
        // if(m*n != or.length) return new int[m][n];
        if (m * n != or.length) return new int[0][0];

        int[][] ans = new int[m][n];
        int idx = 0;
        for(int i = 0 ;i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[i][j] = or[idx++];
            }
        }
        return ans;
    }
}