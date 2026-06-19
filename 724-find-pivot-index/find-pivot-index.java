class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] postfix = new int[n];

        // Prefix Sum Array
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Postfix/Suffix Sum Array
        postfix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] + nums[i];
        }

        // Print arrays
        System.out.println("Prefix : " + Arrays.toString(prefix));
        System.out.println("Postfix: " + Arrays.toString(postfix));

        // Find first index where values are equal
        for (int i = 0; i < n; i++) {
            if (prefix[i] == postfix[i]) {
                return i;
            }
        }

        return -1;
    }
}