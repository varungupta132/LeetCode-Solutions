class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0 ;
        int r = 0 ;

        for(int i : nums){
            r += i;
            l = Math.max(l , i);
        }

        while(l <= r){
            int mid = l + (r-l)/2 ; 
            if(check(nums , k , mid )){
                r = mid -1 ;
            }else l = mid+1;
        }
        return l;
    }

    public boolean check(int[] nums , int k , int mid){
        int c = 0  ;
        int d = 1 ;
        for(int i = 0 ; i < nums.length ; i++){
            if ( c + nums[i] <= mid){
                c = c + nums[i];
            }
            else{
                c = nums[i];
                d++;
            }
        }
        return d <= k;
    }
}