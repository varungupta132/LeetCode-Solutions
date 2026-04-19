class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for(int ii = 0 ; ii < arr.length ; ii++){
            int z = -1;
            int e = arr.length-1;
            for(int i = ii+1 ; i <= e ; i++){
                int num = arr[i];
                z = Math.max( z , num );
            }
        ans[ii] = z;
    }
        return ans;
    }

    // public void helper(int[] ans,int[] arr , int ii , int e){
    //     int z = -1;
    //     for(int i = ii ; i <= e ; i++){
    //         int num = arr[i];
    //         z = Math.max( z , num );
    //     }
    //     ans[ii-1] = z;
    // }
}