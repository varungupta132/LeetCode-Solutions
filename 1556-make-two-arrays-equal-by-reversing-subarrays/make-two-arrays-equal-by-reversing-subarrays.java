class Solution {
    public boolean canBeEqual(int[] ta, int[] arr) {
        // if(ta.length != arr.length) return false;
        int[] res = new int[1001];
        for(int i : ta){
            res[i]++;
        }
        for(int i : arr){
            res[i]--;
        }
        for(int i : res){
            if(i != 0) return false;
        }
        return true;

    }
}