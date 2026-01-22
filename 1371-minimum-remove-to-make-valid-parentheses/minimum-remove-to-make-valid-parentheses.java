class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i); 
            if (ch == '(') {
                stk.push(i);
            } else if (ch == ')') {
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }
        
        while (!stk.isEmpty()) {
            sb.setCharAt(stk.pop(), '*');
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
}
