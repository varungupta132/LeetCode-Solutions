class Solution {

    public char[][] rotateTheBox(char[][] boxGrid) {

        for(int i = 0; i < boxGrid.length; i++) {

            int idx = boxGrid[0].length - 1;

            for(int j = boxGrid[0].length - 1; j >= 0; j--) {

                if(boxGrid[i][j] == '*') {

                    idx = j - 1;
                }

                else if(boxGrid[i][j] == '#') {

                    char temp = boxGrid[i][idx];

                    boxGrid[i][idx] = boxGrid[i][j];

                    boxGrid[i][j] = temp;

                    idx--;
                }
            }
        }

        return rotate(boxGrid);
    }

    public char[][] rotate(char[][] boxGrid) {

        int n = boxGrid.length;
        int m = boxGrid[0].length;

        char[][] ans = new char[m][n];

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                ans[j][n - 1 - i] = boxGrid[i][j];
            }
        }

        return ans;
    }
    
}