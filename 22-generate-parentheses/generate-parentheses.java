class Solution {
    List<String> lst;
    public List<String> generateParenthesis(int n) {
        lst = new ArrayList<>();
        bt(n , "(" , 1 , 0); 
        return lst;      
    }
    public void bt(int n , String str , int o , int c){
        if( o > n || c > n) return;
        if( o  == n && c == n){
            lst.add(str);
            return;
        }
        // bt(n , str + ")" , );
        if(o == c){
            bt(n , str + "(" , o+1 , c);
        }
        if(o > c){
            bt(n , str + ")" , o , c+1);
            bt(n , str + "(" , o+1 , c);

        }




    }
}