class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        arr.add(a);

        for (int i : nums) {
            int n = arr.size();
            for (int j = 0; j < n; j++) {
                List<Integer> oldSubset = arr.get(j);
                ArrayList<Integer> lst = new ArrayList<>();

                for (int x : oldSubset) {
                    lst.add(x);
                }

                lst.add(i);
                arr.add(lst);
            }
        }
        return arr;
    }
}
