class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int diff = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int[] x : points){
            arr.add(x[0]);
        }
        Collections.sort(arr);
        for(int i = 1 ; i < arr.size() ; i++){
            // diff = Math.max(diff , Math.abs(points[i][0] - points[i-1][0]));
            // for(int j = i+1 ; j < arr.size() ; j++){
                diff = (int)Math.max(diff , arr.get(i) - arr.get(i-1));
            }
        
        return diff;
    }
}