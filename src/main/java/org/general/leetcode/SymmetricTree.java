package org.general.leetcode;

import org.general.leetcode.helper.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 != null) {
            return false;
        } else if (node2 == null && node1 != null) {
            return false;
        } else if (node1 == null) {
            return true;
        } else {
            if (node1.val == node2.val) {
                return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
            } else {
                return false;
            }
        }
    }
}
