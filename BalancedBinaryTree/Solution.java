package BalancedBinaryTree;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return searchTree(root) != -1;
    }

    public int searchTree(TreeNode curr) {
        if (curr == null) return 0;

        int left = searchTree(curr.left);
        int right = searchTree(curr.right);

        if (left == -1 || right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}