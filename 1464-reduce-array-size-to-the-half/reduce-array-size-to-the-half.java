import java.util.*;

class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store frequencies
        List<Integer> freq = new ArrayList<>(map.values());

        // Sort in descending order
        Collections.sort(freq, Collections.reverseOrder());

        int removed = 0;
        int count = 0;
        int target = arr.length / 2;

        for (int f : freq) {
            removed += f;
            count++;

            if (removed >= target) {
                return count;
            }
        }

        return count;
    }
}