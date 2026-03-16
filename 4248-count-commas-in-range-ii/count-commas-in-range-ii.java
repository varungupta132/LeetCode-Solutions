class Solution {
    public long countCommas(long n) {
        long thres = 1000;
        long ans = 0;
        while(thres <= n){
            ans += n-thres +1;
            thres *= 1000;
        }
        return ans;
    }
}