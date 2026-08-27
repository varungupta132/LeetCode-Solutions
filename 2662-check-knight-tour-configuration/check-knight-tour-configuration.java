class Solution {
    public boolean checkValidGrid(int[][] grid) {
        boolean[][] u = new boolean[grid.length][grid[0].length];
        if(grid[0][0] == 0)
        u[0][0] = true;
        else return false;
        if(bt(grid , 0 , 0 , u , 1)){
            return true;
        }
        return false;
    }
    public boolean  bt(int[][] grid , int i , int j , boolean[][] u , int num){
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0  ){
            return false;
        }
        if(num == (grid.length*grid.length )) return true;

        // if(u[i][j]) return false ;
        // u[i][j] = true

        if(i+2 < grid.length && j+1 < grid[0].length && grid[i+2][j+1] == num  && u[i+2][j+1] == false){
            u[i+2][j+1] = true;
            if (bt(grid ,i+2 , j+1 , u , num+1)){
                return true;
            }
            u[i+2][j+1] = false;
        }
        if(i+2 < grid.length &&   j-1 >= 0 && grid[i+2][j-1] == num && u[i+2][j-1] == false ){ 
            u[i+2][j-1] = true; 
            if( bt(grid ,i+2 , j-1 , u , num+1) ) return true; 
            u[i+2][j-1] = false; 
        } 
        if(i-2 >= 0 && j+1 <  grid[0].length && grid[i-2][j+1] == num && u[i-2][j+1] == false ){ 
            u[i-2][j+1] = true; 
            if( bt(grid ,i-2 , j+1 , u , num+1) ) return true; 
            u[i-2][j+1] = false; 
        } 
        if(i-2 >= 0  && j-1 >= 0 && grid[i-2][j-1] == num && u[i-2][j-1] == false ){ 
            u[i-2][j-1] = true; 
            if( bt(grid ,i-2 , j-1 , u , num+1) ) return true; 
            u[i-2][j-1] = false; 
        } 
        if(i+1 <  grid.length && j+2 < grid[0].length && grid[i+1][j+2] == num && u[i+1][j+2] == false ){ 
            u[i+1][j+2] = true; 
            if( bt(grid ,i+1 , j+2 , u , num+1) ) return true; 
            u[i+1][j+2] = false; 
        } 
        if(i+1 < grid.length && j-2 >= 0 && grid[i+1][j-2] == num && u[i+1][j-2] == false ){ 
            u[i+1][j-2] = true; 
            if( bt(grid ,i+1 , j-2 , u , num+1) ) return true; 
            u[i+1][j-2] = false; 
        } 
        if(i-1 >= 0 && j+2 < grid[0].length && grid[i-1][j+2] == num && u[i-1][j+2] == false ){ 
            u[i-1][j+2] = true; 
            if( bt(grid ,i-1 , j+2 , u , num+1) ) return true; 
            u[i-1][j+2] = false; 
        } 
        if(i-1 >= 0 && j-2 >= 0 && grid[i-1][j-2] == num && u[i-1][j-2] == false ){ 
            u[i-1][j-2] = true; 
            if( bt(grid ,i-1 , j-2 , u , num+1) ) return true; 
            u[i-1][j-2] = false; 
        }


        return false;


        
    }
}