class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i : arr){
        //     hs.add(i);
        // }
        // return hs.size();
        Arrays.sort(arr);
        int m = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0 ) arr[i] = 1;
            else{
                if(Math.abs(arr[i-1] - arr[i]) > 1 ){
                    arr[i] = arr[i-1] + 1;
                }
                m = Math.max(m , arr[i]);
            }
        }
        return m;
    }
}