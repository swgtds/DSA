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
    public List<Integer> postorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postordertraversal(root, list);
        return list;
    }
    public void postordertraversal(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        
        postordertraversal(root.left, list);
        postordertraversal(root.right, list);
        list.add(root.data);
    }
}    
 
