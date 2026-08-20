class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> permute(int[] nums) {
        lst = new ArrayList<>();
        boolean[] u = new boolean[nums.length];
        List<Integer> x = new ArrayList<>();

        bt(nums ,x, u);
        return lst;
    }
    public void bt(int[] nums , List<Integer> x ,boolean[] u){
        if(x.size() == nums.length){
            lst.add(new ArrayList<>(x));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(u[i]) continue;
            x.add(nums[i]);
            u[i] = true;
            System.out.println("i am addidng to x " + nums[i]);
            System.out.println("your x--> " + x);
            bt(nums , x , u);
            x.remove(x.size()-1);
            u[i] = false;
        }
    }
}