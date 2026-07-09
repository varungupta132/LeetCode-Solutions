class Solution {
    public int maxDigitRange(int[] nums) {
        int dd = 0;
        int sum = 0;

        for (int num : nums) {
            int i = num;
            int s = Integer.MAX_VALUE;
            int l = Integer.MIN_VALUE;

            while (i > 0) {
                int x = i % 10;
                i /= 10;

                s = Math.min(s, x);
                l = Math.max(l, x);
            }

            int range = l - s;

            if (range > dd) {
                dd = range;
                sum = num;
            } else if (range == dd) {
                sum += num;
            }
        }

        return sum;
    }
}