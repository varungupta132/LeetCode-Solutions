class Solution {
    public long gcdSum(int[] nums) {
        long s = 0 ;
        int[] pre = new int[nums.length];
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ;i++){
            if(maxi < nums[i]){
                maxi = nums[i];
                pre[i] = nums[i];
            }
            else{
                pre[i] = gcd(nums[i] , maxi);
            }
        // Arrays.sort(pre);
            // maxi = Math.max(maxi nums[i]);
            // pre[i] = Math.max(nums[i] , maxi);
        }
                Arrays.sort(pre);

        // System.out.println(Arrays.toString(pre));
        long ans = 0;
        int l = 0 ; 
        int r = nums.length-1 ;
        while(l <  r){
            ans += gcd(pre[l] , pre[r]);
            // System.out.println(  nums[l] +" "  + nums[r]   + "------------"+ gcd(nums[l] , nums[r]));
            l++;
            r--;
        }
        // return (long)gcd(pre[0] , pre[pre.length - 1]);
        return ans;


    }
    public static int gcd(int a, int b) {
        // Handle negative numbers by taking their absolute value
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}