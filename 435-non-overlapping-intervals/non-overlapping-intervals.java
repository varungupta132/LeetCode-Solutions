class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in , (a,b) -> a[1] - b[1] );

        System.out.println(Arrays.deepToString(in));
        int ans = 0 ;
        int e = in[0][1];
        for(int i = 1 ; i < in.length ; i++){
            if(e <= in[i][0]){
                e = in[i][1] ;
            }
            else{
                ans++;
            }
        }
        return  ans;
    }
}