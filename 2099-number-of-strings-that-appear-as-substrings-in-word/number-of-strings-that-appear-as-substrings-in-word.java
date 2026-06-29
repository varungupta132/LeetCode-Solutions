class Solution {
    public int numOfStrings(String[] pa, String wo) {
        int cnt = 0;
        for(String str : pa ){
            if(wo.contains(str)){
                cnt++;
            }
        }
        return cnt;
    }
}