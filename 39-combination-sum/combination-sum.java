class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> combinationSum(int[] ca, int ta) {
        lst = new ArrayList<>();
        bt(ca , ta , 0 , new ArrayList<>() );
        return lst ;
    }
    public void bt(int[] ca , int ta , int idx , ArrayList<Integer> arr ){
        System.out.println("ta: " + ta + ", idx: " + idx + ", arr: " + arr);
        if(ta == 0){
            lst.add(new ArrayList<>(arr));
            return;
        }
        if(idx > ca.length-1 || ta < 0){
            return ;
        }
        if(ca[idx] <= ta){
            arr.add(ca[idx]);
            bt(ca , ta-ca[idx] , idx , arr);
            arr.remove(arr.size() -1);
        }

        bt(ca , ta , idx+1, arr);
    }
}