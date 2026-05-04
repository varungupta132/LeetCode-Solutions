class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        if(root == null) return arr;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            int n = q.size();

            for(int i = 0 ; i < n ; i++){

                TreeNode curr = q.poll();

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }

                // last node of level
                if(i == n - 1){
                    arr.add(curr.val);
                }
            }
        }

        return arr;
    }
}