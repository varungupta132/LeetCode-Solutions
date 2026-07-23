class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                sb.append(sum(s.substring(i, end)));
            }

            s = sb.toString();
        }

        return s;
    }

    public String sum(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += ch - '0';
        }
        return String.valueOf(sum);
    }
}