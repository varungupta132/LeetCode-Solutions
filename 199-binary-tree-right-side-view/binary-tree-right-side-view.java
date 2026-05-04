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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
    //     addr(arr , root);
    //     return arr;
    // }
    // public void addr(List<Integer> arr , TreeNode root){
    //     if(root == null) return ;
    //     arr.add(root.val);
    //     addr(arr , root.right);
    // }


    List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return arr;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            int n = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < n ; i++){

                TreeNode curr = q.poll();

                level.add(curr.val);

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            ans.add(level);
        }

        for(List<Integer> lst : ans){
            arr.add(lst.get(lst.size()-1));
        }
        return arr;

}
}