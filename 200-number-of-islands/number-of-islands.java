class Solution {
    boolean[][] u ;
    public int numIslands(char[][] grid) {
        u = new boolean[grid.length][grid[0].length];
        int c = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j  = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1' && !u[i][j] ){
                    c++;
                    dfs(grid , i , j);
                }
            }
        }
        return c;
    }

    public void dfs(char[][] grid ,int   i ,int   j ){
        // System.out.println("calling dfs");
        if( i < 0 || i > grid.length-1 || j < 0 || j  > grid[0].length -1 || grid[i][j] != '1' || u[i][j]) return;
        // System.out.println(Arrays.deepToString(grid));
        u[i][j] = true;
        ArrayList<int[]>  arrr= new ArrayList<>(Arrays.asList(
            new int[]{i+1 , j },
            new int[]{i-1 , j },
            new int[]{i , j+1 },
            new int[]{i , j-1 }
        ));
        for(int[] x :  arrr ){
            if( x[0] < 0 || x[0] > grid.length-1 || x[1] < 0 || x[1]  > grid[0].length -1 || grid[x[0]][x[1]] != '1' || u[x[0]][x[1]]) continue ;

            // System.out.println("Doing somting");
            dfs(grid , x[0], x[1]);
        }



    }
}