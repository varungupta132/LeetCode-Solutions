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
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){

            arr.add(head.val);

            head = head.next ;
        } 
        int ans = 0;
        for(int i = 0 ; i < arr.size()/2 ; i++){
            ans = Math.max(ans , arr.get(i) + arr.get(arr.size()-i-1));
        }
        return ans;
    }
}