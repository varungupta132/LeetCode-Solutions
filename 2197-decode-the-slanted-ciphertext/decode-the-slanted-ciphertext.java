class Solution {
    public String decodeCiphertext(String en, int rows) {
        if(rows == 0) return "";
        
        int n = en.length();
        int cols = n / rows;

        StringBuilder sb = new StringBuilder();

        // Traverse from each column of first row
        for(int startCol = 0; startCol < cols; startCol++) {
            int i = 0;
            int j = startCol;

            // diagonal traversal
            while(i < rows && j < cols) {
                sb.append(en.charAt(i * cols + j));
                i++;
                j++;
            }
        }

        // remove trailing spaces
        return sb.toString().replaceAll("\\s+$", "");
    }
}