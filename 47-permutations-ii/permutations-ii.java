class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>(); 
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used);
        Set<List<Integer>> set = new HashSet<>(ans);
        ans = new ArrayList<>(set);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> path, boolean[] used) {

        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

             if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            path.add(nums[i]);
            used[i] = true;

            backtrack(nums, path, used);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}