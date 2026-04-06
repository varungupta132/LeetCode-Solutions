class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        Set<Integer> removeIndices = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stk.push(i); // push index
            } else if (ch == ')') {
                if (!stk.isEmpty()) {
                    int poppedIndex = stk.pop();
                    if (stk.isEmpty()) {
                        // Stack became empty after popping
                        removeIndices.add(poppedIndex); // index of '('
                        removeIndices.add(i);           // index of ')'
                    }
                }
            }
        }

        // Build the final string skipping removed indices
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!removeIndices.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}