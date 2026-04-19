class Solution {
    public int maxDistance(int[] co) {
        int c = 0 ;
        for(int i = 0 ; i < co.length ; i++){
            for(int j = 0 ; j < co.length ; j++){
                if(co[i] != co[j]){
                     c = Math.max(c , Math.abs(j-i));
                }
            }
        }
        return c;
    }
}