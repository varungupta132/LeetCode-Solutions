class Solution {
    public int minDays(int[] blo, int m, int k) {
        int l = Integer.MAX_VALUE ;
        int r = Integer.MIN_VALUE ;

        for(int i : blo){
            l = Math.min(l , i);
            r = Math.max(r , i);
        }
        int ans = -1 ;
        while( l <= r){
            int mid = l + (r-l)/2;
            if(check(blo , k , m , mid)){
                ans =mid ;
                r = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public boolean check(int[] blo , int k , int m , int ans){
        int f = 0 ; 
        int d = 0 ;
        for(int i = 0 ; i < blo.length ; i++){
            if(blo[i] <= ans){
            f++;
            if(f == k) {
                f = 0 ;
                d++;
            }
            }else{
                f = 0;   
            } 
        }
        return d>=m;
    }
}