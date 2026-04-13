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
                    sb.setCharAt(i , '*');
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            sb.setCharAt(stk.pop() , '*');
        }

        for(int i = 0 ; i < sb.length() ; i++){
            if(sb.charAt(i) != '*'  ){
                ans.append(sb.charAt(i));
            }
        }

        return ans.toString();
    }
}
