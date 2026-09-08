class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        int n = nums.length;
        int max = 0;

        // firstLen first, then secondLen
        for (int i = 0; i + firstLen <= n; i++) {

            int sum1 = 0;
            for (int j = i; j < i + firstLen; j++) {
                sum1 += nums[j];
            }

            // secondLen after firstLen
            for (int j = i + firstLen; j + secondLen <= n; j++) {

                int sum2 = 0;

                for (int k = j; k < j + secondLen; k++) {
                    sum2 += nums[k];
                }

                max = Math.max(max, sum1 + sum2);
            }
        }

        // secondLen first, then firstLen
        for (int i = 0; i + secondLen <= n; i++) {

            int sum1 = 0;
            for (int j = i; j < i + secondLen; j++) {
                sum1 += nums[j];
            }

            // firstLen after secondLen
            for (int j = i + secondLen; j + firstLen <= n; j++) {

                int sum2 = 0;

                for (int k = j; k < j + firstLen; k++) {
                    sum2 += nums[k];
                }

                max = Math.max(max, sum1 + sum2);
            }
        }

        return max;
    }
}