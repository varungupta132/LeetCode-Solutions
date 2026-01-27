class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            arr.add(i+1);
        }

        int cidx = 0 ;
        while(arr.size() > 1){
            int nidx = (cidx+k-1 ) %arr.size();
            arr.remove(nidx);
            cidx = nidx;
        }
        return arr.get(0);
    }
}