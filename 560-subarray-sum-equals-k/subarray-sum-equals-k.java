class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int[] prefix = new int[n - i];
            prefix[0] = nums[i];

            if (prefix[0] == k)
                count++;

            for (int j = i + 1; j < n; j++) {
                prefix[j - i] = prefix[j - i - 1] + nums[j];

                if (prefix[j - i] == k)
                    count++;
            }
        }

        return count;
    }
}