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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode dp1 = d1;
        ListNode dp2 = d2;
        

        ListNode temp = head;
        while(temp != null){
                ListNode mmm = new ListNode(temp.val);

            if(temp.val < x){
                dp1.next = mmm;
                dp1 = dp1.next;
            }
            else{
                dp2.next = mmm;
                dp2 = dp2.next;
            }
            temp = temp.next;
        }

        dp1.next = d2.next ;
        return d1.next;
    }
}