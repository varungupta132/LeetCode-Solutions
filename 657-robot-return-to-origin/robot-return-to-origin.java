class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0 ;
        int l = 0 ;
        for(char ch : moves.toCharArray()){
            if(ch == 'U') u++;
            else if(ch == 'D')u--;
            else if(ch == 'L')l++;
            else if(ch == 'R')l--;
        }

        return u==0 && l == 0;
    }
}