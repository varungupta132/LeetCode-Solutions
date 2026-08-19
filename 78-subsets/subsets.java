import java.util.*;

class Solution {
    List<List<Integer>> lst;

    public List<List<Integer>> subsets(int[] nums) {
        lst = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        
        // Seedhe index 0 se helper function call karein
        bt(nums, x, 0);
        return lst;
    }

    public void bt(int[] num, List<Integer> x, int idx) {
        // Base Case: Jab saare elements check ho jayein
        if (idx == num.length) {
            // HAMESHA ek nayi copy banakar main list mein add karein
            lst.add(new ArrayList<>(x));
            return;
        }

        // Choice 1: Current element ko subset mein SHAMIL KAREIN (Take)
        x.add(num[idx]);
        bt(num, x, idx + 1);

        // Backtracking Step: Agli choice ke liye element ko remove karein
        x.remove(x.size() - 1);

        // Choice 2: Current element ko CHHOD DEIN (Leave/Skip)
        bt(num, x, idx + 1);
    }
}
