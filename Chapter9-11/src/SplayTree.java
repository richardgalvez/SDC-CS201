// Chapter 11, Lesson 3 - Splay Tree Class Example

import java.util.*;

public class SplayTree {
    class Node {
        int value;
        Node left;
        Node right;
            Node(int value) {
                this.value = value;
                right = null;
                left = null;
            }
        private void rotateLeft(SplayTreeNode node) {
            SplayTreeNode formerParent = node.parent;
            SplayTreeNode subtreeParent = formerParent.parent;
            // Move node's left subtree to its former parent
            formerParent.right = node.left;
            if(node.left != null) {
                node.left.parent = formerParent;
            }
            // formerParent now child of node
            node.left = formerParent;
            formerParent.parent = node;
            // node is now child of formerParent's former parent
            node.parent = subtreeParent;
            if(subtreeParent == null) {
                root = node;
            }
            else if(subtreeParent.right == formerParent) {
                subtreeParent.right = node;
            }
            else {
                subtreeParent.left = node;
            }
        }
        private void rotateRight(SplayTree node) {
            SplayTreeNode formerParent = node.parent;
            SplayTreeNode subtreeParent = formerParent.parent;
            // Move node's right subtree to its former parent
            formerParent.left = node.right;
            if(node.right != null) {
                node.right.parent = formerParent;
            }
            // Make formerParent become a child of node
            node.right = formerParent;
            formerParent.parent = node;
            // Make node a child of formerParent's former parent
            node.parent = subtreeParent;
            if(subtreeParent == null) {
                root = node;
            }
            else if(subtreeParent.right == formerParent) {
                subtreeParent.right = node;
            }
            else {
                subtreeParent.left = node;
            }
        }
        private void zigZag(SplayTreeNode node) {
            if(node == node.parent.leftChild) {
                rotateRight(node);
                rotateLeft(node);
            }
            else {
                rotateLeft(node);
                rotateRight(node);
            }
        }
    }
}
