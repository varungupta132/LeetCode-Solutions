class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] sufx = new int[nums.length];

        pref[0] = 1;
        sufx[nums.length-1] = 1;

        for(int i = 1 ; i < nums.length ; i++){
            pref[i]  =  pref[i-1]*nums[i-1];
        }
        for(int j = nums.length-2 ; j >= 0 ; j-- ){
            sufx[j]  =  sufx[j+1]*nums[j+1];
        }

        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = pref[i] * sufx[i];
        }

        System.out.println(Arrays.toString(pref));
        System.out.println(Arrays.toString(sufx));


        return ans;
    }
}