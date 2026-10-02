class Solution {
    public int[][] merge(int[][] in) {
        // Arrays.sort(in , (a,b) -> {
        //     if(a[1] > b[1]) return -1;
        //     else if(a[1] < b[1]) return 1;
        //     return a[0] - b[0];
        // } ) ;

        Arrays.sort(in, (a, b) -> a[0] - b[0]);

        int s = in[0][0];
        int e = in[0][1];
        ArrayList<int[]> ar = new ArrayList<>();
        for(int i = 1 ; i < in.length ; i++){
            if(e>=in[i][0]){
                e = Math.max(in[i][1] , e);
                // continue;
            }
            else{
                ar.add(new int[]{s,e});
                s = in[i][0];
                e = in[i][1];
            }
        }
        ar.add(new int[]{s,e});
        int[][] ans = new int[ar.size()][2];
        for(int i = 0 ; i < ar.size() ; i++){
            ans[i] = ar.get(i);
        }
        return ans;
    }
}