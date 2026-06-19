class Solution {
    public int largestAltitude(int[] gain) {
        int x = 0 ;
        int m = 0 ;
        for(int i : gain){
            x += i;
            m = Math.max( x , m);
        }
        return m;
    }
}