// Chapter 3 Lesson 7 - Doubly Linked Lists Example (Main class file)

public class DoubleMain {
    public static void main(String[] args) {
        // Create the list
        DoubleLists dll = new DoubleLists();
        // Add item to head
        dll.addToHead(50);

        // Add item to tail
        // List is now 100 --> 50 --> NULL
        dll.addToTail(100);
        
        // Add item to head
        // List is 25 --> 100 --> 50 --> NULL
        dll.addToHead(25);

        // Insert 75 after 50
        dll.insertNode(dll.head.next, 75);
        
        // Print output
        dll.printList(dll.head);
    }
}