class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, ans);

        return new ArrayList<>(new HashSet<>(ans));
    }

    public void backtrack(int[] nums, int idx, List<List<Integer>> ans) {

        if (idx == nums.length) {

            List<Integer> x = new ArrayList<>();

            for (int num : nums) {
                x.add(num);
            }

            ans.add(x);

            return;
        }

        for (int i = idx; i < nums.length; i++) {

            // swap
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;

            // recursively continue swapping
            backtrack(nums, idx + 1, ans);

            // undo swap
            temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }
}