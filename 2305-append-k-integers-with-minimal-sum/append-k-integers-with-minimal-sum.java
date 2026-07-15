class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);

        int x = 1;
        long ans = 0;

        for (int i : nums) {

            if (i < x) continue;

            if (i == x) {
                x = i + 1;
                continue;
            }

                int n = i - x;
                int t=Math.min(k,n);
                long first = x;
                long last = (long) x + t - 1;

                ans += (long) t * (first + last) / 2;
                x=i+1;
                k = k-t;
                if(k==0)break;
        }

        if (k > 0) {
            long first = x;
            long last = (long) x + k - 1;

            ans += (long) k * (first + last) / 2;
        }

        return ans;
    }
}