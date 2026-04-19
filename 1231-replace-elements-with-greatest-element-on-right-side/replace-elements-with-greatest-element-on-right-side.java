class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            helper( ans , arr , i+1 , arr.length-1);
        }
        return ans;
    }

    public void helper(int[] ans,int[] arr , int ii , int e){
        int z = -1;
        for(int i = ii ; i <= e ; i++){
            int num = arr[i];
            z = Math.max( z , num );
        }
        ans[ii-1] = z;
    }
}