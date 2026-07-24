class Solution {
    public boolean canJump(int[] nums) {
        boolean[] ans = new boolean[nums.length];
        for(int i = nums.length-1 ; i >=0 ; i--){
            if(i == nums.length-1){
                ans[i] = true;
            }else{
                boolean f = false;
                for(int j = i+1;(j-1)<i+nums[i] && j<nums.length;j++){
                    if(ans[j]){
                        // ans[i]=true;
                        f=true;
                        break;
                    }
                }
                ans[i]=f;
            }
        }
        System.out.println(Arrays.toString(ans));        
        return ans[0];
    }
}