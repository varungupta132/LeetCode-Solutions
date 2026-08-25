class Solution {
    List<List<String>> lst ;
    public List<List<String>> partition(String s) {
        lst = new ArrayList<>();
        check(s , new ArrayList<String>()  , 0);
        return lst;
    }
    public void check(String s ,  ArrayList<String > arr , int idx ){
        // if(idx > s.length()) return;
        if(idx == s.length()){ lst.add(new ArrayList<>(arr));
        return;
        }

        for(int i = idx +1 ; i <= s.length() ; i++){
        String s1 = s.substring(idx , i);
        // String s2 = s.substring(idx , s.length() ) ;
        // ArrayList<String > q = new ArrayList<>();
        if(pal(s1)){
            arr.add(s1);
            check( s , arr , i) ;
            arr.remove(arr.size()-1);
        }
        // if(pal(s2)){
        //     arr.add(s2);
        //     check(s2 , arr , idx) ;
        //     arr.remove(arr.size()-1);
        // }
    }
    }
    public boolean pal(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}