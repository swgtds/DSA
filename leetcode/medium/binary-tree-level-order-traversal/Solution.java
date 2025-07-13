class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> array = new ArrayList<>();
        if(root==null)
            return array;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!= null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            array.add(list);
        }
        return array;
    }
}
