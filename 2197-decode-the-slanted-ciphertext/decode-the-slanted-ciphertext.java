class Solution {
    public String decodeCiphertext(String en, int row) {
        if (row == 0) return "";

        int n = en.length();
        int col = n / row;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < col; i++) {
            int r = 0, c = i;

            while (r < row && c < col) {
                int idx = r * col + c;
                sb.append(en.charAt(idx));
                r++;
                c++;
            }
        }

        // remove trailing spaces
        int end = sb.length() - 1;
        while (end >= 0 && sb.charAt(end) == ' ') {
            end--;
        }

        return sb.substring(0, end + 1);
    }
}