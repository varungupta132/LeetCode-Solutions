class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ;
        int r = 0 ;
        for(int i : piles){
            r = Math.max(i , r);
        }
        while(l <= r){
            int mid =  l + ( r-l )/2;
            // System.out.println(mid);
            if(check(mid , piles , h)){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return l;
    }

public boolean check(int mid, int[] piles, int h) {

    long hours = 0;

    for (int bananas : piles) {
        hours += (int)Math.ceil((double)bananas / mid);
        if (hours > h) {
            return false;
        }
    }

    return true;
}
}