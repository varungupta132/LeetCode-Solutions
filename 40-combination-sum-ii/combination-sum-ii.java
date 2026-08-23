class Solution {
    // public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> lst ;
    public List<List<Integer>> combinationSum2(int[] ca, int ta) {
        lst = new ArrayList<>();
        Arrays.sort(ca);
        bt(ca , ta , 0 , new ArrayList<>() );
        // Sahi tareeka duplicate lists hatane ka:
        HashSet<List<Integer>> hs = new HashSet<>(lst);
        lst = new ArrayList<>(hs);

        return lst ;
    }
    public void bt(int[] ca , int ta , int idx , ArrayList<Integer> arr ){
         if(ta == 0){
            lst.add(new ArrayList<>(arr));
            return;
        }
        for(int i = idx; i < ca.length; i++) {

            // Duplicate ko same level par skip karo
            if(i > idx && ca[i] == ca[i - 1])
                continue;

            // Since array sorted hai
            if(ca[i] > ta)
                break;

            arr.add(ca[i]);

            // i + 1 because each element can be used only once
            bt(ca, ta - ca[i], i + 1, arr);

            arr.remove(arr.size() - 1);
        }
    }
}