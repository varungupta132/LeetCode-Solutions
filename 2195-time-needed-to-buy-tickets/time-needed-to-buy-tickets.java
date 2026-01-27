class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        // Queue<Integer> que = new ArrayDeQue<>();
        int time = 0;
        int idx = 0;
        while(t[k] > 0){
            // if(t[idx==0]){

            // }
            if(t[idx] != 0 ){
                t[idx]--;
                time++;
            }
            idx = (idx + 1)% t.length ; 
        }
        return time;
    }
}