import java.util.*;

class Solution {
    List<List<Integer>> lst;

    public List<List<Integer>> subsets(int[] nums) {
        lst = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        
        // Index 0 se shuru karte hain
        findSubsets(nums, 0, currentSubset);
        return lst;
    }

    public void findSubsets(int[] nums, int idx, List<Integer> current) {
        // Base Case: Jab hum saare elements check kar chuke hon
        if (idx == nums.length) {
            // Is time hamare paas ek complete combination hai, isko main list mein save kar lo
            lst.add(new ArrayList<>(current));
            return;
        }

        // --- OPTION 1: NOT TAKE (Element ko chhod dein) ---
        // Hum current element ko touch nahi karte, seedhe agle index par chale jaate hain
        findSubsets(nums, idx + 1, current);


        // --- OPTION 2: TAKE (Element ko shamil karein) ---
        // Pehle element ko list mein add karo
        current.add(nums[idx]);
        
        // Ab is added element ke sath agle index par jao
        findSubsets(nums, idx + 1, current);
        
        // Waapas aate waqt element ko hata do (Safai/Clean up step)
        current.remove(current.size() - 1);
    }
}
