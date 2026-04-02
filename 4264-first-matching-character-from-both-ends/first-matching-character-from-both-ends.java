class Solution {
    public int firstMatchingIndex(String str) {
        int s = 0;
        while( s < str.length()){
            
            if(str.charAt(s) == str.charAt(str.length() -1 -s)) return s;
            
            s++;
        }
        return -1;
    }
}