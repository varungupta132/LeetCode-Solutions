class Solution {
    public List<String> maxNumOfSubstrings(String s) {

        HashMap<Character, Integer> last = new HashMap<>();
        HashMap<Character, Integer> first = new HashMap<>();

        // first and last index
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!first.containsKey(ch)) {
                first.put(ch, i);
            }

            last.put(ch, i);
        }

        ArrayList<String> arr = new ArrayList<>();

        // valid substrings
        for (char ch : first.keySet()) {

            int start = first.get(ch);
            int end = last.get(ch);

            boolean valid = true;

            for (int i = start; i <= end; i++) {

                char curr = s.charAt(i);

                // character ka first occurrence
                // substring ke bahar hai
                if (first.get(curr) < start) {
                    valid = false;
                    break;
                }

                // character ka last occurrence bhi
                // substring ke andar lana padega
                end = Math.max(end, last.get(curr));
            }

            if (valid) {
                arr.add(s.substring(start, end + 1));
            }
        }

        // substring ko END index ke according sort karo
        arr.sort((a, b) -> {
            int endA = s.indexOf(a) + a.length() - 1;
            int endB = s.indexOf(b) + b.length() - 1;
            return endA - endB;
        });

        ArrayList<String> ans = new ArrayList<>();

        int prevEnd = -1;

        // maximum non-overlapping substrings
        for (String str : arr) {

            int start = s.indexOf(str);
            int end = start + str.length() - 1;

            if (start > prevEnd) {
                ans.add(str);
                prevEnd = end;
            }
        }

        return ans;
    }
}