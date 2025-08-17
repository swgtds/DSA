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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<s; i++){
                TreeNode node = q.poll();
                list.add(node.data);
                if(node.left!= null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(list);
        }
        return ans;
    }
}
