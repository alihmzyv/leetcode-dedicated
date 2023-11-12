package org.general.leetcode;

import org.general.leetcode.helper.TreeNode;

public class SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) {
            return false;
        } else if (q == null && p != null) {
            return false;
        } else if (p == null) {
            return true;
        }
        boolean leftIsSame = isSameTree(p.left, q.left);
        boolean rightIsSame = isSameTree(p.right, q.right);
        if (leftIsSame && rightIsSame) {
            return p.val == q.val;
        } else {
            return false;
        }
    }
}
