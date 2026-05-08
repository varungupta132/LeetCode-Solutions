class Solution {
    public String longestDiverseString(int a, int b, int c) {

        StringBuilder sb = new StringBuilder();

        while (a > 0 || b > 0 || c > 0) {

            // highest, second highest decide karo
            if (a >= b && a >= c) {

                if (!isInvalid(sb, 'a')) {
                    sb.append('a');
                    a--;
                } else if (b >= c && b > 0) {
                    sb.append('b');
                    b--;
                } else if (c > 0) {
                    sb.append('c');
                    c--;
                } else {
                    break;
                }

            } else if (b >= a && b >= c) {

                if (!isInvalid(sb, 'b')) {
                    sb.append('b');
                    b--;
                } else if (a >= c && a > 0) {
                    sb.append('a');
                    a--;
                } else if (c > 0) {
                    sb.append('c');
                    c--;
                } else {
                    break;
                }

            } else {

                if (!isInvalid(sb, 'c')) {
                    sb.append('c');
                    c--;
                } else if (a >= b && a > 0) {
                    sb.append('a');
                    a--;
                } else if (b > 0) {
                    sb.append('b');
                    b--;
                } else {
                    break;
                }
            }
        }

        return sb.toString();
    }

    public boolean isInvalid(StringBuilder sb, char ch) {

        int n = sb.length();

        if (n >= 2 && sb.charAt(n - 1) == ch && sb.charAt(n - 2) == ch) {
            return true;
        }

        return false;
    }
}