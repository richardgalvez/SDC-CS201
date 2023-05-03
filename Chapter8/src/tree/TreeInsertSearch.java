// Chapter 8, Lesson 1 - Trees In Data Structures Examples (Insert and Search)

package tree;

public class TreeInsertSearch {
    // Tree Insert structure
    public Node insertNode (Node node, int data) {
        if(Node == null) {
            node = new Node(data);
            return Node;
        }
        if(data <= node.data) {
            node.leftChild = insertNode(node.leftChild, data);
        }
        else if(data > node.data) {
            node.rightChild = insertNode(node.rightChild, data);
        }
        return node;
    }
    // Tree Search structure
    public Node findNode (Node node, int data) {
        if(Node == null) {
            return null;
            if(data == node.data) {
                return node;
            }
            if(data <= node.data) {
                return findNode(node.leftChild, data);
            }
            else if(data > node.data) {
                return findNode(node.rightChild, data);
            }
            return null;
        }
    }
}