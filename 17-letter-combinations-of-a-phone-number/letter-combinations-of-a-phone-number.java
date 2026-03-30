class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> lst = new ArrayList<>();
        helpi(lst , map , "" , 0 , digits);
        return lst;
    }

    public void helpi(List<String> lst , String[] map , String curr , int idx , String digits ){
        if(digits.length() == curr.length()) {
            lst.add(curr);
            return;
        }

        String latters = map[digits.charAt(idx) - '0'];

        for(int i = 0 ; i < latters.length() ; i++){
            char ch = latters.charAt(i);
            helpi(lst, map , curr+ch , idx+1 , digits);
        }

    }
}