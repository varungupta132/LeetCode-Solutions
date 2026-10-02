class Solution {
    public int[] dailyTemperatures(int[] te) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[te.length];
        for(int i =0;i < te.length ; i++){
             if(stk.isEmpty()){
                stk.push(i);
             }
             else{
                int ele = te[i];
                while(!stk.isEmpty() && ele > te[stk.peek()]){
                    int idx = stk.pop();
                    ans[idx] = i-idx ;
                }
                stk.push(i);
             }
        }
        return ans;
    }
}