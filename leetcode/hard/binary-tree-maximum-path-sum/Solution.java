class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPath(root, max);
        return max[0];
    }

    int maxPath(TreeNode root, int[] max) {
        if (root == null)
            return 0;
        int left = Math.max(0, maxPath(root.left, max));
        int right = Math.max(0, maxPath(root.right, max));
        max[0] = Math.max(max[0], root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
