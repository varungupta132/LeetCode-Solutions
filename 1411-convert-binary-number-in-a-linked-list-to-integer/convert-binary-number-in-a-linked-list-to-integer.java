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
    public int getDecimalValue(ListNode head) {
        if(head.next == null){
            return head.val;
        }
        ListNode t = head;
        int s = 0 ;
        while(t.next != null){
            s++;
            t = t.next;
        }


    //  long c = 0 ;
    //  while(head !=null){
    //     c = c * 10 + head.val;
    //     head = head.next;
    //  }  


    //  System.out.println("total c ----->" + c);
    int ans = 0 ;
    // int idx = 0 ;
     while(head != null){
// ----------->

        ans = ans + (int)Math.pow(2 , s--)*head.val;

        head = head.next;




// ----------->

    //     int r = (int)(c % 10);
    //     c = c / 10;
    //     ans = ans +(int)Math.pow(2 , idx++ ) * r ;
    //  System.out.println("total ans ----->" + ans + "at index" + idx);
     }


     return ans;
    }
}