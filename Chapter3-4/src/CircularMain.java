// Chapter 3, Lesson 6 - Circular Linked List Example (Main file)

import java.util.*;
class CircularMain {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.addNodeToHead(75);
        myList.addNodeToHead(50);
        myList.addNodeToHead(25);
        myList.print();

        myList.addNodeToTail(100);;
        myList.print();

        myList.rotateElement();
        myList.print();

        myList.deleteNodeFromTail();
        myList.print();

        myList.deleteNodefromHead();
        myList.print();
    }
}