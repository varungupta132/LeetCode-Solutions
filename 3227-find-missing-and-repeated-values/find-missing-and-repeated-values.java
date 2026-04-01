class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int c = 0;
        HashSet<Integer> hs = new HashSet<>();
int[] ans = new int[2];
        for(int i = 0 ; i < grid.length ; i++){
            for(int  j = 0 ; j < grid[0].length ; j++){
                c+= grid[i][j];
                if(!hs.add(grid[i][j])){
                    ans[0] = grid[i][j];
                }
            }
        }
        int n = grid.length * grid.length ;
        int mis =  Math.abs((n* (n+1) / 2 )- c + ans[0]);
        ans[1] = mis ;

        return ans;

    }
}