class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> combine(int n, int k) {
        lst = new ArrayList<>();
        bt(n , k , new ArrayList<>() , 1) ;
        return lst ;
    }
    public void bt(int n , int k , ArrayList<Integer> arr , int ele){
        if(arr.size() == k){
            lst.add(new ArrayList<>(arr));
            return;
        }
        for(int i = ele ; i <= n ; i++){
            arr.add(i);
            bt(n , k , arr , i+1);
            arr.remove(arr.size()-1);
        }
    }
}