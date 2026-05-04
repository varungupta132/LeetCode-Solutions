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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        help(arr , root);
        return arr;
    }
    public void help(List<Integer> arr , TreeNode root){
        if(root == null) return;
        help(arr , root.left);
        arr.add(root.val);
        help(arr , root.right);
    }
}