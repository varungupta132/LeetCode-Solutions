class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> combinationSum(int[] ca, int ta) {
        lst = new ArrayList<>();
        Arrays.sort(ca);
        bt(ca , ta , 0 , new ArrayList<>() );

        return lst ;
    }
    public void bt(int[] ca , int ta , int idx , ArrayList<Integer> arr ){
        // System.out.println("ta: " + ta + ", idx: " + idx + ", arr: " + arr);
        if(ta == 0){
            lst.add(new ArrayList<>(arr));
            return;
        }
        if(ca[idx] > ta) return;
        for(int i = idx ; i < ca.length ; i++){
            arr.add(ca[i]);
            bt(ca , ta-ca[i] , i , arr);
            arr.remove(arr.size() -1);
        }
        // if(idx > ca.length-1 || ta < 0){
        //     return ;
        // }
        // if(ca[idx] <= ta){
        // }

        // bt(ca , ta , idx+1, arr);
    }
}