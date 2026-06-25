class Solution {
    public void setZeroes(int[][] ma) {
        int m = ma.length ;
        int n = ma[0].length ;
        ArrayList< int[] > arr = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(ma[i][j] == 0){
                    int[] zzz  = new int[2];
                    zzz[0] = i;
                    zzz[1] = j;
                    arr.add(zzz);
                }
            }
        }
        for(int[] nn : arr){
            ma= change( ma , nn[0] , nn[1]);
        }
        // return ma;
    }

    public int[][] change(int[][] ma , int s , int e){
        for(int i = 0 ; i < ma.length ; i++ ){
            for(int j = 0 ; j < ma[0].length ; j++){
                if(s == i ||j == e){
                    ma[i][j] = 0;
                }
            }
        }
        return ma;
    }
}