class Solution {
    public int maxArea(int[] h) {
        int l = 0 ; 
        int r = h.length  -1 ;
        int a = 0;
        while( l  < r){
            a = Math.max(a , (r-l)* Math.min(h[l] , h[r]));
            if(h[l] < h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return a;
    }
}