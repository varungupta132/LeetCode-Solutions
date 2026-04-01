class Solution {
    public boolean canAliceWin(int n) {
        boolean alice = true;
        int x = 10;
        if(n < 10) return false;
        while(n >=0){
            n = n - x-- ;
            alice = !alice;
        }
        return alice;
    }
}