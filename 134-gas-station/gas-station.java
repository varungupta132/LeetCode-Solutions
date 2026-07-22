class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum  = 0 ;
        for(int i : gas){
            sum+= i;
        }
        for(int i : cost){
            sum -= i;
        }
        if(sum <0) return -1;
        int ming = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;
        int ans = -1;
        int cf = 0 ;
        int st = 0;

        for(int  i = 0 ; i < gas.length ; i++){
            // if(gas[i] > cost[i]) return i
            cf += gas[i] - cost[i];
            if(cf <0) {
            st = i+1;
            cf = 0;
            }

        }
        return st;
    }
}