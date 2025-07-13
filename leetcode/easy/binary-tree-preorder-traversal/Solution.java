class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> array = new ArrayList<>();
        preorder(root, array);
        return array;
    }
    void preorder(TreeNode root, List<Integer> array){
        if(root == null){
            return;
        }
        array.add(root.val);
        preorder(root.left, array);
        preorder(root.right, array);
    }
    
    // Iterative Approach

    // public List<Integer> preorderTraversal(TreeNode root){
    //     List<Integer> list = new ArrayList<>();
    //     if(root==null)
    //         return list;
    //     Stack<TreeNode> stack = new Stack<>();
    //     stack.push(root);
    //     while(!stack.isEmpty()){
    //         root=stack.pop();
    //         list.add(root.val);
    //         if(root.right!=null)
    //             stack.push(root.right);
    //         if(root.left!=null)
    //             stack.push(root.left);
    //     }
    //     return list;
    // }

}
