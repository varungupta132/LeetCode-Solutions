class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s = startTime.split(":");
        String[] e = endTime.split(":");

        // return (end[0] - start[0])*60*60 +
        int startSeconds = Integer.parseInt(s[0]) * 3600 +
                   Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]);

        int endSeconds = Integer.parseInt(e[0]) * 3600 +
                        Integer.parseInt(e[1]) * 60 + Integer.parseInt(e[2])  ;

        // System.out.println(Arrays.toString(start)); // [12, 45]
        // System.out.println(Arrays.toString(end));   // [15, 30]
        return endSeconds - startSeconds;
    }
}