/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store values
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // Step 2: Sort
        Collections.sort(list);

        // Step 3: Create new linked list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}