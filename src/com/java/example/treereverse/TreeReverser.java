package com.java.example.treereverse;

import java.util.Objects;

public class TreeReverser {

    public void recursiveReverse(TreeNode node) {

        if (Objects.isNull(node)) {
            return;
        }

        TreeNode temp = node.getLeftChild();
        node.setLeftChild(node.getRightChild());
        node.setRightChild(temp);

        recursiveReverse(node.getLeftChild());
        recursiveReverse(node.getRightChild());

    }

    public String toString(TreeNode root) {
        if (root == null) {
            return "";
        }

        return root.getValue() + " " +
                toString(root.getLeftChild()) +
                toString(root.getRightChild());
    }
}
