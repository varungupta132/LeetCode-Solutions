class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c !=  mat.length * mat[0].length) return mat;
        int[][] ans = new int[r][c];
        
        int ridx = 0;
        int cidx = 0 ;
        for(int i = 0 ;i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                // if(ridx == r-1) ridx=0;
                ans[ridx][cidx] = mat[i][j];
                cidx++;
                if(cidx == c){ 
                    ridx++ ;
                    cidx = 0 ;
                }
            }
        }
        return ans;
    }
}