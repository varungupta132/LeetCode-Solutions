class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0 ;
        while(i < k-1){
            char tem = s.charAt(i) ;
            sb.setCharAt(i , s.charAt(k-1));
            sb.setCharAt( k-1  , tem );
            i++;
            k--;
        }
        return sb.toString();
    }
}