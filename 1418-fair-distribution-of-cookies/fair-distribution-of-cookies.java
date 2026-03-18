class Solution {
    int minUnfairness = Integer.MAX_VALUE;
    
    public int distributeCookies(int[] co, int k) {
        // Your sorting is good for optimization
        Arrays.sort(co);
        int n = co.length;
        for(int i = 0; i < n/2; i++){
            int temp = co[i];
            co[i] = co[n-1-i];
            co[n-1-i] = temp;
        }
        
        int[] sum = new int[k]; // Keep your sum array
        backtrack(co, 0, sum, k); // Use backtracking instead of greedy loop
        return minUnfairness;
    }
    
    private void backtrack(int[] co, int idx, int[] sum, int k) {
        // Base case: all cookies distributed
        if (idx == co.length) {
            int maxSum = 0;
            for (int s : sum) {
                maxSum = Math.max(maxSum, s);
            }
            minUnfairness = Math.min(minUnfairness, maxSum);
            return;
        }
        
        // Try giving current cookie to each child (not just minimum)
        for (int i = 0; i < k; i++) {
            sum[i] += co[idx];
            backtrack(co, idx + 1, sum, k);
            sum[i] -= co[idx]; // Backtrack - undo choice
        }
    }
}