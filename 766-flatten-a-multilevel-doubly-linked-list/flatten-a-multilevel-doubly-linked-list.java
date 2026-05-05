/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;

        while(temp != null){
            Node curr = temp;
            Node currn = curr.next;
            if(temp.child != null){
                Node dusra = temp.child;
                Node dd = dusra;
                while(dd.next != null){
                    dd = dd.next;
                }
                curr.next = dusra;
                dusra.prev = curr;
                dd.next = currn;
                if(currn != null){
                    currn.prev = dd;
                }

                temp.child = null;
            }
            temp = temp.next;
        }

        return head;
    }
}