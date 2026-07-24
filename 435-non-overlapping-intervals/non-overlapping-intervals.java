class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
        int end = intervals[0][1];
        int c = 0;
        for(int i = 1 ;i < intervals.length ;i++){
            int te = intervals[i][0];
            if(end > te){
                c++;
            }
            else{
                end = intervals[i][1];
            }
        }
        return c;
    }
}