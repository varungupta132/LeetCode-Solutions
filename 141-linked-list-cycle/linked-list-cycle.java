/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode l= head;
        if(head == null) return false;

        while(l != null && l.next != null){
            s = s.next;
            l = l.next.next;
            if(s == l){
                return true;
            }
        }

        return false;
    }
}