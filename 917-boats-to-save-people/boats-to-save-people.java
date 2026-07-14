class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int s = 0;
        Arrays.sort(p);
        int l = 0 ;
        int r = p.length-1 ;
        while(l <= r){
            if(p[l] + p[r] <= limit){
                l++;
                r--;
                s++;
            }
            else{
                r--;
                s++;
            }
        }
        return s;
    }
}