class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points , (a,b) -> Integer.compare(a[1] , b[1 ]));
        System.out.println(Arrays.deepToString(points));
        int b = 1 ;
        int l = points[0][1];
        for(int i= 1 ; i< points.length ; i++){
            if(points[i][0] > l){
                b++;
                l = points[i][1];
            }
        }
        return b;
    }
}