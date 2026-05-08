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
    
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
            List<Integer> ans = new ArrayList<>();
        while(q.size() >0){
            ans =  new ArrayList<>();
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                TreeNode pre = q.poll();
            ans.add(pre.val);
                

                if(pre.left != null){
                    q.offer(pre.left);
                }
                if(pre.right != null){
                    q.offer(pre.right);
                }
            }
        }
        int sum = 0 ; 
        for(int xxx : ans){
            sum += xxx;
        }
        return sum;
    }
}