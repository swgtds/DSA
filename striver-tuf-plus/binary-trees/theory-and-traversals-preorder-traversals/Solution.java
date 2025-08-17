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
    public List<Integer> preorder(TreeNode root) {
    List<Integer> list = new ArrayList<>();
        preordertraversal(root, list);
        return list;
    }
    public void preordertraversal(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        list.add(root.data);
        preordertraversal(root.left, list);
        preordertraversal(root.right, list);
    }
}    
   
