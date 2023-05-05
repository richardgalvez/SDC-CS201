// Chapter 13, Lesson 3 - Implementing Trie Operators Example (Trie Nodes)

public class TNode {
    TNode myTree = new TNode();
    public void add(String theWord) {
        TNode myNode = myTree;
        for(char theChar : theWord.toCharArray()) {
            TNode childNode = myNode.subNode(theChar);
            // subNode would be a method in the TNode class
            if(childNode != null) {
                myNode = childNode;
            }
            else {
                childNode.NodeList.add(new TNode(theChar));
                myNode = myNode.subNode(theChar);
            }
        }
    }
    public static void main(String[] args) {
        for(char theChar : stringtoFind.toCharArray()) {
            myNode = myNode.subNode(theChar);
        }
    }
}
