class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i = 0 ; i < s.length() ;i++){
            for(int j = i+1 ; j < s.length() ;j++){
                if(s.charAt(i) == s.charAt(j) && distance[s.charAt(j) -'a'] != j-i-1) return false;
            }
        }
        return true;
    }
}