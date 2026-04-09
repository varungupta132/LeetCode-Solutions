class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m = 0 ; 
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > m){
                m = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}