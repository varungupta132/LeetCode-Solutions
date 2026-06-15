class Solution {
    public int shipWithinDays(int[] we, int da) {
        int l = 0 ;
        int r = 0;
        for(int i : we ){
            l = Math.max(l , i);
            r += i;
        }
        while( l<= r){
            int mid = l + (r-l)/2 ;
            System.out.println(mid);
            if(check(we , da , mid)){
                r = mid -1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }

    public boolean check(int[] we , int da , int mid){
        int c = 0 ;
        int d = 1;
        for(int i = 0 ; i < we.length ; i++){
            if( c + we[i] <= mid){
                c+=we[i];
            }else{
                c = we[i];
                d++;
            }
        }
        return d <= da;
    }
}