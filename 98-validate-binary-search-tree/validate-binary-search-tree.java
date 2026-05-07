class Solution {

    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        boolean left = check(Long.MIN_VALUE, root.val, root.left);

        boolean right = check(root.val, Long.MAX_VALUE, root.right);

        return left && right;
    }

    public boolean check(long min, long max, TreeNode root){

        if(root == null) return true;

        if(root.val >= max || root.val <= min) {
            return false;
        }

        return check(min, root.val, root.left)
            &&
               check(root.val, max, root.right);
    }
}