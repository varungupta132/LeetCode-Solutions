class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s = 0;
        int e = 0;
        int o = 0;
        for(int i = 1  ; i <= n*2 ; i+=2){
            o++;
        }
        for(int i = 2  ; i <= n*2 ; i+=2){
            e++;
        }

        return gcd(e , o);
    }
    public int gcd (int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}