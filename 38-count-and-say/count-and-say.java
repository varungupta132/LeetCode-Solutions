class Solution {

    public String countAndSay(int n) {
        return rle(n);
    }

    public String rle(int x) {

        if (x == 1) return "1";

        String str = rle(x - 1);

        HashMap<Integer, Integer> hm = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < str.length()) {

            hm.clear();

            int num = str.charAt(i) - '0';

            while (i < str.length() && (str.charAt(i) - '0') == num) {

                hm.put(num, hm.getOrDefault(num, 0) + 1);

                i++;
            }

            sb.append(hm.get(num));
            sb.append(num);
        }

        return sb.toString();
    }
}