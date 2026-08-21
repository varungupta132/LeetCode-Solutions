class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> subsets(int[] nums) {
        lst = new ArrayList<>();
        // lst.add(new ArrayList<Integer>());
        List<Integer> arr = new ArrayList<>();
        // boolean[] u = new boolean[nums.length];
        bt(nums , arr , 0);
        // Collections.sort(lst);
        Collections.sort(lst, (a, b) -> Integer.compare(a.size(), b.size()));

        return lst;
    }
    public void bt(int[] nums , List<Integer> arr, int idx){
                lst.add(new ArrayList<>(arr));
        if(idx > nums.length-1 ){
            // lst.add(new ArrayList<Integer>(arr));
            return ;
        }
        for(int i = idx ; i < nums.length ; i++){
            // if(!u[i]){
                arr.add(nums[i]);
                bt(nums , arr , i+1 );
                arr.remove(arr.size() -1 );
                
            // }
        }
    }
}