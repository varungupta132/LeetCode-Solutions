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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp.next != null){
            int f =temp.val;
            int s = temp.next.val;
            while (s != 0) {
                int tempp = s;
                s = f % s;
                f = tempp;
            } 
            ListNode d = temp;
            ListNode ls = new ListNode(f);
            ListNode x = d.next;
            d.next = ls;
            ls.next = x;
            temp = temp.next.next;
        }
        return head;
        
    }
}