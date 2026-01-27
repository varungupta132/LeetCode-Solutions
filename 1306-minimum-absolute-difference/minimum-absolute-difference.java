class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length-1 ; i++){
            min = Math.min(min , Math.abs(arr[i] - arr[i+1]));
        }
        for(int i = 1 ; i<arr.length ; i++){
            if(Math.abs(arr[i] -arr[i-1]) == min ){
                ArrayList<Integer> aaa = new ArrayList<>();
                aaa.add(arr[i-1]);
                aaa.add(arr[i]);
                // i++;
                res.add(aaa);
            }
        }
        return res;
    }
}