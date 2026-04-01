class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int[] arr : nums1){
            hm.put(arr[0] , hm.getOrDefault(arr[0] , 0) + arr[1]);
        }
        for(int[] arr : nums2){
            hm.put(arr[0] , hm.getOrDefault(arr[0] , 0) + arr[1]);
        }
        ArrayList<ArrayList<Integer>> arrr = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(key);
            ar.add(value);
            arrr.add(ar);
        }
        Collections.sort(arrr, (a, b) -> a.get(0) - b.get(0));
        int[][] result = new int[arrr.size()][2];

for (int i = 0; i < arrr.size(); i++) {
    result[i][0] = arrr.get(i).get(0);
    result[i][1] = arrr.get(i).get(1);
}

return result;

        

    }
}