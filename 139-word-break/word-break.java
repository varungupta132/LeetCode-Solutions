class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return solve(hs, dp, s, 0);
    }

    boolean solve(HashSet<String> hs, Boolean[] dp, String str, int idx) {

        if (idx == str.length())
            return true;

        if (dp[idx] != null)
            return dp[idx];

        for (int i = idx; i < str.length(); i++) {

            if (hs.contains(str.substring(idx, i + 1)) &&
                solve(hs, dp, str, i + 1)) {

                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }
}