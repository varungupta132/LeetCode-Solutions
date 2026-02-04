class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stk.isEmpty() && list.get(i) > list.get(stk.peek())) {
                ans[stk.pop()] = list.get(i);
            }

            stk.push(i);
        }

        return ans;
    }
}
