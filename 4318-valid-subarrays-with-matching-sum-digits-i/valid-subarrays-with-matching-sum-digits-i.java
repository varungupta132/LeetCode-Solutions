class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            long cnt = 0;

            for (int j = i; j < nums.length; j++) {
                cnt += nums[j];

                if (check(cnt, x)) {
                    c++;
                }
            }
        }

        return c;
    }

    public boolean check(long cnt, int x) {
        String s = String.valueOf(cnt);

        int f = s.charAt(0) - '0';
        int l = s.charAt(s.length() - 1) - '0';

        return f == x && l == x;
    }
}