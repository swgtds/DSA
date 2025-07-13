class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        postorder(root, array);
        return array;
    }
    void postorder(TreeNode root, List<Integer> array){
        if(root == null)
            return;
        postorder(root.left, array);
        postorder(root.right, array);
        array.add(root.val);
    }
}
