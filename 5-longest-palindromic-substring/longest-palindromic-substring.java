class Solution {
    public String longestPalindrome(String s) {
        int st = 0 ; 
        int e = 0 ; 
        int maxi = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(solve(s , i , j )){
                    if(maxi < j-i+1){
                        maxi = j-i+1;
                        st = i;
                        e = j;
                    }
                }
            }
        }
        return s.substring(st , e+1);
    }

    public boolean solve(String str , int s , int e){
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}