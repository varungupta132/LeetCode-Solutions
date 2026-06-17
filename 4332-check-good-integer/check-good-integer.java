class Solution {
    public boolean checkGoodInteger(int n) {
        int s = 0;
        int ss = 1 ;
        while(n > 0){
            int l = n  % 10;
            n = n / 10;
            s += l;
            ss = ss + l*l;
        }
        return Math.abs(ss -s) >=50;
    }
}