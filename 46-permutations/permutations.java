class Solution {
    List<List<Integer>> lst;
    public List<List<Integer>> permute(int[] nums) {
        lst = new ArrayList<>();
        // lst.add(new ArrayList<Integer>());
        List<Integer> arr = new ArrayList<>();
        boolean[] u = new boolean[nums.length];
        bt(nums , arr , u);
        return lst;
    }
    public void bt(int[] nums , List<Integer> arr , boolean[] u){
        if(arr.size() == nums.length){
            lst.add(new ArrayList<Integer>(arr));
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!u[i]){
                arr.add(nums[i]);
                u[i] = true;
                bt(nums , arr , u);
                arr.remove(arr.size() -1);
                u[i] = false;
            }
        }
    }
}