class Solution {
        List<List<Integer>> lst ;
    public List<List<Integer>> combinationSum3(int k, int n) {

        lst = new ArrayList<>();
        bt(9 , k , n, new ArrayList<>() , 1) ;
        return lst ;

    }
    public void bt(int n , int k ,int sum ,  ArrayList<Integer> arr , int ele){
        if(sum == 0 && arr.size() == k){
            lst.add(new ArrayList<>(arr));
            return;
        }
        for(int i = ele ; i <= n ; i++){
            arr.add(i);
            bt(n , k , sum - i ,  arr , i+1);
            arr.remove(arr.size()-1);
        }
    }
}