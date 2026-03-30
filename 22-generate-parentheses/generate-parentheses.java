class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        addp(lst , "" , 0 , 0 , n);
        return lst;
    }

    public void addp(List<String> lst , String curr , int o , int c , int n){
        if(curr.length() == n*2){
        lst.add(curr);
        return;
        }
        if(o < n) addp(lst , curr + "(" , o+1 , c , n);
        if(c < o) addp(lst , curr + ")" , o , c+1 , n);
        
    }
}