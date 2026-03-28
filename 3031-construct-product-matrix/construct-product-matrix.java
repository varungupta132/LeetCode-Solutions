class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int[] arr = new int[grid.length * grid[0].length];
        int idx = 0;
        for(int[] i : grid){
            for(int j : i){
                arr[idx++] = j%12345;
            }
        }
        int[] pref = new int[grid.length * grid[0].length];
        int[] sufx = new int[grid.length * grid[0].length];
        pref[0] = 1;
        sufx[sufx.length -1]=1;

        for(int i = 1 ; i < pref.length ; i++){
            pref[i] = (pref[i-1]*arr[i-1])%12345;
        }
        for(int i = sufx.length-2 ; i >= 0 ; i--){
            sufx[i] = (sufx[i+1] * arr[i+1])%12345;
        }
        for(int i = 0 ; i < pref.length ; i++){
            arr[i] = (pref[i] * sufx[i])%12345;
        }
        int xyz = 0;
        int[][] ans =  new int[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                ans[i][j] = arr[xyz++];
            }
        }
        return ans;


        
        



    }
}