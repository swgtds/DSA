class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        inorder(root, array);
        return array;
    }
    void inorder(TreeNode root, List<Integer> array){
        if(root==null)
            return;
        inorder(root.left, array);
        array.add(root.val);
        inorder(root.right, array);
    }
}
