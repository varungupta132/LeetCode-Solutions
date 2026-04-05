class Solution {
    public String decodeCiphertext(String en, int rows) {
        int c = en.length() / rows;
        StringBuilder sb = new StringBuilder();
        
        for (int start = 0; start < c; start++) {
            int idx = start;

            while (idx < en.length()) {
                sb.append(en.charAt(idx));
                idx = idx + c + 1;

                // ❗ stop if next jump goes to invalid diagonal
                if (idx % c == 0) break;
            }
        }

        return sb.toString().replaceAll("\\s+$", "");
    }
}