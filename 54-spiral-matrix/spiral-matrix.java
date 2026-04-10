class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int top = 0 ;
        int left = 0;
        int right = matrix[0].length-1 ;
        int bottom = matrix.length-1;

        while(left <= right && top <= bottom) {
        // left -> right 
        for(int i = left ; i<= right ;i++){
            lst.add(matrix[top][i]);
            // System.out.println(matrix[i][top]);
        }
        top++;
        for(int i = top ; i<= bottom ; i++){
            lst.add(matrix[i][right]);
        }
        right--;
        if(bottom >= top)
        for(int i = right ; i >=left ; i--){
            lst.add(matrix[bottom][i]);
        }
        bottom--;
        if(right >= left)
        for(int i = bottom ; i >= top ; i--){
            lst.add(matrix[i][left]);
        }
        left++;
}
        return lst;

    }
}