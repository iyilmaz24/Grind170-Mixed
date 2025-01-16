package InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode curr;
        TreeNode left;

        q.add(root);
        while(q.size() > 0) {
            curr = q.remove();

            left = curr.left;
            curr.left = curr.right;
            curr.right = left;

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

        return root;
    }
}