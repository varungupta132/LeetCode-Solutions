class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxtime = logs[0][1];
        int ans = logs[0][0];

        for(int i = 1  ; i < logs.length ; i++){
            int time = logs[i][1] - logs[i-1][1];
            if(time > maxtime || (time == maxtime && ans > logs[i][0])){
                maxtime = time;
                ans = logs[i][0];
            }
        }
        return ans;
    }
}