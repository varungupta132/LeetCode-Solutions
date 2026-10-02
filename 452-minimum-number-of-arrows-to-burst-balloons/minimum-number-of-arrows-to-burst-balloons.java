class Solution {
    public int findMinArrowShots(int[][] po) {
        Arrays.sort(po , (a,b) -> Integer.compare(a[1], b[1]));
        System.out.println(Arrays.deepToString(po));
        int ar = 1 ;
        long ps = po[0][0];
        long pe = po[0][1];
        for(int i = 1 ;i < po.length; i++){
            long s = po[i][0];
            long e = po[i][1];
            if(pe<s){
                ar++;
                pe = e ;
            }
            // else{

            // }
        }
        return ar;
    }
}