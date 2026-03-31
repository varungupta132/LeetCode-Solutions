class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int c = 0 ; 
        for( String str : words){
            boolean bhai = true;
            for(char ch : str.toCharArray()){
                if(allowed.indexOf(ch) == -1) bhai = false;
            }
            if(bhai) c++;
        }
        return c;

    }
}