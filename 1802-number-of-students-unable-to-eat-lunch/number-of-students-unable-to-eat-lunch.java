class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stk = new Stack<>();
        for(int i = sandwiches.length - 1; i >= 0; i--){
            stk.push(sandwiches[i]);
        }
        
        Queue<Integer> que = new ArrayDeque<>();
        for(int i : students){
            que.offer(i);   //poll;
        }
        int c = 0;

        while(!stk.isEmpty() && c < stk.size()){
            if (stk.peek().equals(que.peek())) {
                stk.pop();     // remove from stack
                que.poll(); 
                c = 0;   // remove from queue
            }
            else{
                int x = que.poll();
                que.offer(x);
                c++;
            }

        }
        return que.size();
    }
}