class Solution {
    public int trailingZeroes(int n) {
        int a = 5;
        int c  = 0 ;
        if(n == 0) return 0;
        while(n > 0){
            c = c + n / 5 ;
            n = n / 5;
        }
        return c;
    }
}