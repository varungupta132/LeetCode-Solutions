class Solution {
    public int countOdds(int low, int high) {
        int c = 0 ;
        if(low % 2 == 0){
            low = low + 1;
        }
        for(int i = low ; i <= high ; i = i + 2){
            if(low % 2 != 0) c++;
        }
        return c;
    }
}