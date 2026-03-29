class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(i%2 == 0) e.add(nums[i]);
            else o.add(nums[i]);
        }
        Collections.sort(e);
        Collections.sort(o , Collections.reverseOrder());

        int[] ans = new int[nums.length];
        int edx = 0;
        int odx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i%2 == 0) ans[i] = e.get(edx++);
            else ans[i] = o.get(odx++);
        }
        return ans;

    }
}