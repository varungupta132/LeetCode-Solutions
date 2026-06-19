class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // if(arr.length %3 != 0 ) return false;
        int s = 0 ;
        for(int i : arr){
            s+=i;
        }
        if(s % 3 != 0) return false;
        int n = s/3;
        int x = 0 ;
        int v = 0;
        for(int i : arr){
            x = x + i;
            if(x == n){
                x = 0;
                v++;
            }
        }
        return v >= 3;

    }
}