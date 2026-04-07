class Solution {
    public int[] recoverOrder(int[] or, int[] fri) {
        int[] ans = new int[fri.length];
        int idx = 0;

        // Count frequencies of elements in fri
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int f : fri) {
            map.put(f, map.getOrDefault(f, 0) + 1);
        }

        // Place elements according to or
        for (int o : or) {
            if (map.containsKey(o)) {
                int count = map.get(o);
                for (int i = 0; i < count; i++) {
                    ans[idx++] = o;
                }
                map.remove(o); // optional, not needed
            }
        }

        return ans;
    }
}