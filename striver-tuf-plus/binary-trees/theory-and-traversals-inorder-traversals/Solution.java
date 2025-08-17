/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inordertraversal(root, list);
        return list;
    }
    public void inordertraversal(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        inordertraversal(root.left, list);
        list.add(root.data);
        inordertraversal(root.right, list);
    }
}
