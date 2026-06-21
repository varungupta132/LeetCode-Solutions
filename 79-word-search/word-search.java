class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (check(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean check(char[][] board, String word,
                         int i, int j, int idx) {

        // Entire word matched
        if (idx == word.length()) {
            return true;
        }

        // Out of bounds or character mismatch
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(idx)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
                check(board, word, i + 1, j, idx + 1) ||
                check(board, word, i - 1, j, idx + 1) ||
                check(board, word, i, j + 1, idx + 1) ||
                check(board, word, i, j - 1, idx + 1);

        // Backtrack
        board[i][j] = temp;

        return found;
    }
}