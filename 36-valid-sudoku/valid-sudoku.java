class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Row & Column check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hr = new HashSet<>();
            HashSet<Character> hc = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // Row
                char x = board[i][j];
                if (x != '.') {
                    if (!hr.add(x)) {
                        return false;
                    }
                }

                // Column
                char y = board[j][i];
                if (y != '.') {
                    if (!hc.add(y)) {
                        return false;
                    }
                }
            }
        }

        // 3x3 Grid check
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> box = new HashSet<>();

                for (int ii = 0; ii < 3; ii++) {
                    for (int jj = 0; jj < 3; jj++) {

                        char val = board[boxRow + ii][boxCol + jj];
                        if (val != '.') {
                            if (!box.add(val)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
