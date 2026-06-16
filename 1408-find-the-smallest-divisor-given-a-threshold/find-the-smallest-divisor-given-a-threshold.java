class Solution {
    public int smallestDivisor(int[] nums, int th) {
        // int l = Integer.MAX_VALUE ; 
        int l = 1;
        int r = Integer.MIN_VALUE;
        for(int i : nums){
            //  l = Math.min(i , l);
            r = Math.max( r , i );
        }

        while(l<=r){
            int mid = l + (r-l)/2;
            if(cal(mid , nums , th)){
                r = mid - 1;
            }
            else l = mid+1;
        }

        return l;


        // int dedo = 0;
        // int r = threshold ;
        // int ans  = Integer.MAX_VALUE;
        // for(int i = l ; i <= r ; i++){
        //     int s = 0 ; 
        //     for(int z : nums){
        //         s = s + (int)Math.ceil(z/i);
        //     }
        //     System.out.println(s);
        //     if(s < ans){
        //         ans = s;
        //         dedo = i;
        //     }
        // }
        // return dedo;
    }

    public boolean cal(int mid , int[] num , int da){
        int c = 0;
        int d = 0;
        for(int i : num){
            c = c + (int)Math.ceil((double)i / mid);
        }
        return c <= da;
    }
}