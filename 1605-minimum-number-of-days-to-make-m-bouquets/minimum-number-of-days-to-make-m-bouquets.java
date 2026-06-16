class Solution {
    public int minDays(int[] blo, int m, int k) {
        long l = Integer.MIN_VALUE; 
        long r = 0;
        for(int i : blo){
            l=Math.min(l , (long)i);
            r = Math.max(r , (long)i);
        }
        long ans=-1;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(check(blo , mid , m , k)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)ans;
    }

    public boolean check(int[] blo , long ans , int m , int k){
        int f=0;
        int b=0;
        for(int i = 0 ; i <blo.length;i++){
          if(blo[i]<=ans){
             f++;
             if(f==k){
                b++;
                f=0;
             }
          }else{
            f=0;
          }
        }
        return b>=m?true:false;
      
    }
}