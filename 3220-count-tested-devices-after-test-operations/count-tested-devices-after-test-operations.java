class Solution {
    public int countTestedDevices(int[] ba) {
        int c = 0 ; 
        for(int i= 0 ; i < ba.length ; i++){
            if(ba[i] > 0){
                for(int j = i+1; j < ba.length ; j++){
                    if(ba[j] >0) ba[j]--;
                }
                c++;
            }
        }
        return c;
    }
}