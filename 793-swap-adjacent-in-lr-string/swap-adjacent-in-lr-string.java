class Solution {
    public boolean canTransform(String start, String end) {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {

            // Skip all X in start
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }

            // Skip all X in end
            while (j < n && end.charAt(j) == 'X') {
                j++;
            }

            // If both reached the end
            if (i == n && j == n) {
                return true;
            }

            // One reached the end but the other didn't
            if (i == n || j == n) {
                return false;
            }

            // Characters must be the same (L with L or R with R)
            if (start.charAt(i) != end.charAt(j)) {
                return false;
            }

            // L can only move left
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }

            // R can only move right
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}