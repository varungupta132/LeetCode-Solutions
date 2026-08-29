class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int currColor = image[sr][sc];

        if(currColor == color)
            return image;

        dfs(image, sr, sc, currColor, color);

        return image;
    }

    public void dfs(int[][] image, int r, int c,
                    int currColor, int newColor) {

        if(r < 0 || r >= image.length ||
           c < 0 || c >= image[0].length ||
           image[r][c] != currColor) {
            return;
        }

        image[r][c] = newColor;

        dfs(image, r + 1, c, currColor, newColor); // down
        dfs(image, r - 1, c, currColor, newColor); // up
        dfs(image, r, c + 1, currColor, newColor); // right
        dfs(image, r, c - 1, currColor, newColor); // left
    }
}