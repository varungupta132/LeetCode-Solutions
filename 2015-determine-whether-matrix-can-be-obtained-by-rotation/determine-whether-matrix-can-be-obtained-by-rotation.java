class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)) return true;

        int[][] r1 = tran(mat);
        if (Arrays.deepEquals(r1, target)) return true;

        int[][] r2 = tran(r1);
        if (Arrays.deepEquals(r2, target)) return true;

        int[][] r3 = tran(r2);
        if (Arrays.deepEquals(r3, target)) return true;

        return false;
    }
    public int[][] tran(int[][] matrix){
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                int val = matrix[i][j];
                ans[j][matrix.length -1 -i] = val;
            }
        }
        return ans;
    }
}