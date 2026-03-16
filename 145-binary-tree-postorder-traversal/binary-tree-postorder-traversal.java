/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        xyz(lst , root);
        return lst;
    }
    public void xyz(List<Integer> lst , TreeNode root){
        if(root == null){
            return;
        }
        xyz(lst , root.left );
        xyz(lst , root.right );
        lst.add(root.val);
    }
}