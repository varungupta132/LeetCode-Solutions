class Solution {
    public int integerBreak(int n) {
        int c = 1;
        if(n ==1 || n ==2) return 1;
        if(n ==3) return 2;
        while(n > 4){
            n-=3;
            c = c * 3;
        }
        c = c * n;
        return c;
    }

}