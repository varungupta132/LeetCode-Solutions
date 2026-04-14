class Solution {
    public int minimumDistance(int[] nums) {
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        hm.putIfAbsent(nums[i], new ArrayList<>());
        hm.get(nums[i]).add(i);
    }

    int ans = Integer.MAX_VALUE;
    boolean found = false;

    for (ArrayList<Integer> list : hm.values()) {
        if (list.size() < 3) continue;

        found = true;

        for (int i = 2; i < list.size(); i++) {
            int dist = list.get(i) - list.get(i - 2);
            ans = Math.min(ans, dist);
        }
    }

    return found ? ans * 2 : -1;

}
}
