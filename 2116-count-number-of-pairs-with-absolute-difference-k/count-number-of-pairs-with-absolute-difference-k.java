class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (int key : map.keySet()) {
    if (map.containsKey(key + k)) {
        int multiply = map.get(key) * map.get(key + k);

        System.out.println("Keys: " + key + " & " + (key + k)
                + " -> " + multiply);

        ans += multiply;
    }
}

return ans;
    }
}