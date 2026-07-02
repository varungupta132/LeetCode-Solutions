class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {

        int ans = 0;

        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        int max3 = Integer.MIN_VALUE, min3 = Integer.MAX_VALUE;
        int max4 = Integer.MIN_VALUE, min4 = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {

            int v1 = arr1[i] + arr2[i] + i;
            int v2 = arr1[i] + arr2[i] - i;
            int v3 = arr1[i] - arr2[i] + i;
            int v4 = arr1[i] - arr2[i] - i;

            max1 = Math.max(max1, v1);
            min1 = Math.min(min1, v1);

            max2 = Math.max(max2, v2);
            min2 = Math.min(min2, v2);

            max3 = Math.max(max3, v3);
            min3 = Math.min(min3, v3);

            max4 = Math.max(max4, v4);
            min4 = Math.min(min4, v4);
        }

        ans = Math.max(ans, max1 - min1);
        ans = Math.max(ans, max2 - min2);
        ans = Math.max(ans, max3 - min3);
        ans = Math.max(ans, max4 - min4);

        return ans;
    }
}