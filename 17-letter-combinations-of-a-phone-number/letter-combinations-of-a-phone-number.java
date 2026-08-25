class Solution {

    List<String> ans;

    public List<String> letterCombinations(String di) {

        ans = new ArrayList<>();

        if(di.length() == 0)
            return ans;

        ans.add("");

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

        ArrayList<String> x = new ArrayList<>();

        for(char ch : di.toCharArray()) {
            x.add(map[ch - '0']);
        }

        for(String ss : x) {
            do_with(ans, ss);
        }

        return ans;
    }

    public void do_with(List<String> ans, String ss) {

        ArrayList<String> nn = new ArrayList<>();

        for(char ch : ss.toCharArray()) {

            String sss = ch + "";

            for(String xxx : ans) {

                nn.add(xxx + sss);
            }
        }

        ans.clear();

        for(String str : nn) {
            ans.add(str);
        }
    }
}