class Solution {
    public boolean detectCapitalUse(String word) {
        boolean fl = false;
        boolean fu = false;
        // if(word.length() <= 2 && word.charAt(0)){
            
        // }
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(i == 0 && Character.toUpperCase(c) == c){
                continue;
            }
            if(i == 0 && Character.toLowerCase(c) == c){
                fl = true;
            }
            

            if(i == 1 && Character.toUpperCase(c) == c){
                fu = true;
            }
            if(i == 1 && Character.toLowerCase(c) == c){
                fl = true;
            }
            if(fu == true && Character.toLowerCase(c) == c){
                return false;
            }
            if(fl == true && Character.toUpperCase(c) == c){
                return false;
            }
        
        }
        return true;

    }
}