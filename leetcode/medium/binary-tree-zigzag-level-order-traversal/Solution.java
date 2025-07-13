class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> array = new ArrayList<>();
        if (root == null)
            return array;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean f = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (f) {
                    list.add(node.val);           
                } else {
                    list.add(0, node.val);        
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

            }
            f = !f;
            array.add(list);

        }
        return array;
    }
}
