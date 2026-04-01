class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        boolean st = false;
        boolean end = false;
        for(int i = 0 ; i < sb.length() ; i++){
            if(sb.charAt(i) == '0' && st == false){
                sb.deleteCharAt(i);
                i--;
            }
            else if(sb.charAt(i) != '0'){
                st = true;
                break;
            }
        }

        for(int i = sb.length() -1 ; i >=0  ; i--){
            if(sb.charAt(i) == '0' && end == false){
                sb.deleteCharAt(i);
            }
            else if(sb.charAt(i) != '0'){
                end = true;
                break;
            }
        }

        return sb.toString();
    }
}