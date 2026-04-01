class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] it1, int[][] it2) {
        TreeMap<Integer , Integer> hm = new TreeMap<>();

        for(int[] arr : it1){
            hm.put(arr[0] , hm.getOrDefault(arr[0] , 0) + arr[1]);
        }
        for(int[] arr : it2){
            hm.put(arr[0] , hm.getOrDefault(arr[0] , 0) + arr[1]);
        }
        List<List<Integer>> arrr = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : hm.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(key);
            ar.add(value);
            arrr.add(ar);
        }
        // Collections.sort(arrr, (a, b) -> a.get(0) - b.get(0));
        // int[][] result = new int[arrr.size()][2];

        // for (int i = 0; i < arrr.size(); i++) {
        //     result[i][0] = arrr.get(i).get(0);
        //     result[i][1] = arrr.get(i).get(1);
        // }

        // return result;
        return arrr;

    }
}