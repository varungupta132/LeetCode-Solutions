class Solution {
    public int hammingWeight(int n) {
        int mask = 1 ;
        int cnt = 0;
        for(int i  = 0 ; i < 31 ; i++){
            if( (n & mask) !=0  ){
                cnt++;
            }
            mask<<=1;
        }
        return cnt;
    }
}