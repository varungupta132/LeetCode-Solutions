class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> subsets(int[] nums) {
        lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>());
        List<Integer> arr = new ArrayList<>();
        // boolean[] u = new boolean[nums.length];
        bt(nums , arr , 0);
        // Collections.sort(lst);
        return lst;
    }
    public void bt(int[] nums , List<Integer> arr, int idx){
        if(idx > nums.length-1 ){
            // lst.add(new ArrayList<Integer>(arr));
            return ;
        }
        for(int i = idx ; i < nums.length ; i++){
            // if(!u[i]){
                arr.add(nums[i]);
                lst.add(new ArrayList<>(arr));
                bt(nums , arr , i+1 );
                arr.remove(arr.size() -1 );
                
            // }
        }
    }
}