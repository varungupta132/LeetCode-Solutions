import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans  = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            ans.add(listRow);
        }
        return ch(ans , k);
    }

    public List<List<Integer>> ch(List<List<Integer>> ans, int k) {
        if (k == 0) return ans;
        
        List<List<Integer>> nextAns = new ArrayList<>();
        boolean first = true;

        // Aapke logic ke hisab se 'ans' list se 'i' aur 'j' ka loop chalega
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> lst = new ArrayList<>();
            
            for (int j = 0; j < ans.get(0).size(); j++) {
                if (first) {
                    first = false;
                    // Last row ki last value ko pehle element par daalna
                    lst.add(ans.get(ans.size() - 1).get(ans.get(0).size() - 1));
                } else if (j > 0) {
                    // Pichli column ki value uthana
                    lst.add(ans.get(i).get(j - 1));
                } else if (j == 0) {
                    // Pichli row ki last column ki value uthana
                    lst.add(ans.get(i - 1).get(ans.get(0).size() - 1));
                }  
            }
            nextAns.add(lst);
        }

        return ch(nextAns, k - 1);
    }
}
