class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
            hs.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ii : hs){
            int freq = hm.get(ii);
            if(freq > k) freq = k;
            for(int i = 0 ; i < freq ; i++){
                arr.add(ii);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = arr.get(i);
        }
        return ans;

    }
}