class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        addr(arr, root, 0);

        return arr;
    }

    public void addr(List<Integer> arr, TreeNode root, int level){

        if(root == null) return;

        // first node of this level
        if(level == arr.size()){
            arr.add(root.val);
        }

        // right first
        addr(arr, root.right, level + 1);

        // then left
        addr(arr, root.left, level + 1);
    }
}