class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int c = 0 ;
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = nums.size()-1;
        while(!check(arr , k)){
            if(idx < 0) break;
            c++;
            arr.add(nums.get(idx));
            idx--; 
        }
        return c;
    }
    public boolean check(ArrayList<Integer>arr , int k){
        for(int i = 1 ; i <=k ; i++ ){
            if(!arr.contains(i)){
                return false;
            }
        }
        return true;
    }
}