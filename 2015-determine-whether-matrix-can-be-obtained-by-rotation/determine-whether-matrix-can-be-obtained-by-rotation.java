import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k = 0; k < 4; k++){
            if(Arrays.deepEquals(mat, target)) return true;
            rotate(mat); // rotate in-place
        }
        return false;
    }

    public void rotate(int[][] matrix){
        int n = matrix.length;

        // transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse rows
        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}