class Solution {
    public String restoreString(String s, int[] ind) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ind.length ; i++){
            sb.append(" ");
        }
        for(int i = 0 ; i < ind.length ; i++){
            int idx = ind[i];
            char ch = s.charAt(i);
            sb.setCharAt(idx , ch);
        }
        return sb.toString();
    }
}