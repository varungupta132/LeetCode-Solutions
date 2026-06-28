class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = gs.length;
        int[] freq = new int[n + 1];
        for (int x : gs) {
            freq[x]++;
        }
        for (int size = 1; size <= n; size++) {

    if (freq[size] == 0) continue;

    ArrayList<Integer> temp = new ArrayList<>();

    for (int i = 0; i < n; i++) {

        if (gs[i] == size) {

            temp.add(i);

            if (temp.size() == size) {
                arr.add(new ArrayList<>(temp));
                temp.clear();
            }
        }
    }
}



    return arr;
    }
}