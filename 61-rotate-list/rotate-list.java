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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int size = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            size++;
            temp2 = temp2.next;
        }

        k = k % size;
        for(int i = 0 ; i < k ; i++)
        {
        ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
                ListNode xyz = temp.next;
                temp.next = null;
                xyz.next = head;
                head = xyz ;
        }
        return head;
    }
}