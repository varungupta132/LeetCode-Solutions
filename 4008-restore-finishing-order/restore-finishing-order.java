class Solution {
    public int[] recoverOrder(int[] or, int[] fri) {
        int[] ans = new int[fri.length];
        int idx = 0;
        for(int i : or){
            for(int j = 0 ; j < fri.length ; j++){
                if(fri[j] == i){
                    ans[idx++] = fri[j];
                }
            }
        }
        return ans;
    }
}