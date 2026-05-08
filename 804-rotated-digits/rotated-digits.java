class Solution {
    public int rotatedDigits(int n) {
        int c = 0; 
        for(int i = 1 ; i <= n ; i++){
            int r = rot(i);
            if(r != -1 &&  r != i){ c++;
            System.out.println("counted for rotated  --> " + r + "    and number i->"  + i);
            }
        }
        return c;
    }
    public int rot(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(int i = 0 ; i < sb.length() ; i++){
            char ch = sb.charAt(i);
            if(ch == '6'){
                sb.setCharAt(i , '9');
            }
            if(ch == '9'){
                sb.setCharAt(i , '6');
            }
            if(ch == '5'){
                sb.setCharAt(i , '2');
            }
            if(ch == '2'){
                sb.setCharAt(i , '5');
            }
            else if(ch == '3' || ch == '4' || ch == '7') {
                return -1;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}