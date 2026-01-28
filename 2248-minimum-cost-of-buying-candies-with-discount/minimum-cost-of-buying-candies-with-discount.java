class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c = 0;
        int idx =0;
        for(int i = cost.length-1 ; i>=0 ; i--){
            idx++;
            if(idx == 3){
                idx = 0;
                continue;
            }
            c = c + cost[i];
        }
        return c;
    }
}