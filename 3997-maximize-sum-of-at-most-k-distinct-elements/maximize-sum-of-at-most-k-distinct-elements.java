class Solution {
    public int[] maxKDistinct(int[] arr, int k) {
        Arrays.sort(arr);
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!seen.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                seen.add(arr[i]);
                k--;
            }
            if(k <= 0) break;
        }

        int[] ans = new int[seen.size()];
        int idx = 0;
        for(int i : seen ){
            ans[idx++] = i;
        }

        return ans;


    }
}