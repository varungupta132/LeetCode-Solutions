class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] u = new boolean[image.length][image[0].length];
        

        bfs(image , sr , sc , color , image[sr ][sc] , u);

        return image ;
    }
    public void bfs(int[][] img , int sr , int sc , int color ,int currcolor , boolean[][] u ){
        if(sr < 0 || sr >= img.length || sc < 0 || sc >= img[0].length || img[sr][sc] != currcolor || u[sr][sc] ){
            return;
        }
        System.out.println(Arrays.deepToString(img));
        img[sr][sc] = color;
        u[sr][sc] = true;
        ArrayList<int[]> arr = new ArrayList<>(Arrays.asList(
            new int[]{sr + 1, sc},
            new int[]{sr - 1, sc},
            new int[]{sr, sc + 1},
            new int[]{sr, sc - 1}
        ));


        for(int[] x : arr){
            int uu = x[0];
            int v = x[1];
            // if(img[uu][v] == color){
            if(uu < 0 || uu >= img.length || v < 0 || v >= img[0].length ){
                continue ;
            }
            if(img[uu][v] == currcolor)
                bfs(img , uu , v , color , img[uu][v] , u);
            // }
        }

        

    }
}