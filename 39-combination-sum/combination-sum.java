import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] ca, int ta) {
        List<List<Integer>> lst = new ArrayList<>();
        // 1. Sort karne se hamesha pruning fast hoti hai
        Arrays.sort(ca); 
        
        // 2. Local pass karo, global variables runtime slow karte hain
        bt(ca, ta, 0, new ArrayList<>(), lst);
        return lst;
    }

    private void bt(int[] ca, int ta, int idx, List<Integer> arr, List<List<Integer>> lst) {
        // Base case: Target mil gaya
        if (ta == 0) {
            lst.add(new ArrayList<>(arr));
            return;
        }

        // Loop idx se shuru hoga
        for (int i = idx; i < ca.length; i++) {
            // 🔥 CRITICAL OPTIMIZATION (Pruning):
            // Agar current element hi target se bada hai, toh aage ke saare elements
            // sorted array me aur bade honge. Isliye loop ko YAHI se tod (break) do.
            if (ca[i] > ta) {
                break; 
            }

            arr.add(ca[i]);
            // i pass karo kyunki hum same element ko dubara le sakte hain
            bt(ca, ta - ca[i], i, arr, lst); 
            arr.remove(arr.size() - 1); // Backtrack
        }
    }
}
