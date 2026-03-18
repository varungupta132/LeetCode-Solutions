class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                int val = matrix[i][j];
                ans[j][matrix.length -1 -i] = val;
            }
        }
        for(int i = 0; i < ans.length; i++){
    for(int j = 0; j < ans[0].length; j++){
        matrix[i][j] = ans[i][j];
    }
}
        // System.out.println(ans);
        
    }
}