package org.general.leetcode.helper;

import org.general.leetcode.SameTree;

public class TreeNode {
    int val;
    SameTree.TreeNode left;
    SameTree.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, SameTree.TreeNode left, SameTree.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}