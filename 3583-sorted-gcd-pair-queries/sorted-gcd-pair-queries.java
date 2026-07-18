import java.util.*;

class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        // Frequency of each value
        int[] freq = new int[max + 1];
        for (int x : nums)
            freq[x]++;

        // cnt[i] = how many numbers are divisible by i
        long[] cnt = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                cnt[i] += freq[j];
            }
        }

        // exact[i] = number of pairs having gcd exactly i
        long[] exact = new long[max + 1];

        for (int i = max; i >= 1; i--) {

            exact[i] = cnt[i] * (cnt[i] - 1) / 2;

            for (int j = i + i; j <= max; j += i) {
                exact[i] -= exact[j];
            }
        }

        // Prefix sums
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exact[i];
        }

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {

            long target = queries[k] + 1;

            int l = 1;
            int r = max;

            while (l < r) {
                int mid = l + (r - l) / 2;

                if (prefix[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[k] = l;
        }

        return ans;
    }
}