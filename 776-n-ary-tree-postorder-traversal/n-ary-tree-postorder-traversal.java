/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    
    public List<Integer> postorder(Node root) {
        List<Integer> lst = new ArrayList<Integer>();
        xyz(root , lst);
        return lst;
    }

    public void xyz(Node root , List<Integer> lst){
        if(root == null) return;
        for(Node child : root.children){
            xyz(child, lst);
        }
        lst.add(root.val);
    }
}