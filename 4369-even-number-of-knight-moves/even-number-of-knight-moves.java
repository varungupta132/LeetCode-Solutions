class Solution {
    public boolean canReach(int[] start, int[] target) {
        int a=start[0]+start[1];
        int b=target[0]+target[1];
        return a%2==b%2;
    }
}