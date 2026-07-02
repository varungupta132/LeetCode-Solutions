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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0 ;
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp ;
        ListNode ls1 = l1 ;
        ListNode ls2 = l2 ;

        while(ls1 != null || ls2 != null){
        int sum = c ;
            if (ls1 != null) {
                sum += ls1.val;
                ls1 = ls1.next;
            }
            if (ls2 != null) {
                sum += ls2.val;
                ls2 = ls2.next;
            }c = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            }
        if (c > 0) {  
    dummy.next = new ListNode(c);
}

        return temp.next;

    }
}