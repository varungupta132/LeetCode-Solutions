class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        for(int l = 0 ;  l < nums.size() ; l++){
            for(int r = l+1 ; r < nums.size() ; r++){
                int sum = nums.get(l) + nums.get(r) ;
                if(sum < target){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}