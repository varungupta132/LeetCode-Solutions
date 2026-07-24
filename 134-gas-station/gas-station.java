class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0 ; i < cost.length; i++){
            sum += cost[i];
            sum -= gas[i];
        }
        if(sum > 0) return -1;

        int start = 0;
        int rem = 0;
        int tt = 0;
        for(int i = 0 ; i < gas.length ; i++){
            int diff = gas[i] - cost[i];
            tt+= diff;
            rem += diff;
            if(rem < 0){
                start = i +1;
                rem = 0;
            }
        }

        return tt>=0?start:-1;

    }
}