class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        ArrayList<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int row = 0;
        boolean goingDown = true;

        for (char ch : s.toCharArray()) {

            rows.get(row).append(ch);

            if (row == 0) {
                goingDown = true;
            } else if (row == numRows - 1) {
                goingDown = false;
            }

            if (goingDown) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder sb : rows) {
            ans.append(sb);
        }

        return ans.toString();
    }
}