// Chapter 3, Lesson 7 - Doubly Linked List Example (DoubleLists class file)

import java.util.*;
public class DoubleLists {
    // New Node to start the list
    Node head;
    // Thre rest of the methods will be below
    public void addToHead(int element) {
        Node n = new Node(element);
        // The next of the one is now the head
        // Make the previous node null
        n.next = head;
        n.prev = null;
        // Previous of head is the new node
    {   if(head != null) {
        head.prev = n;
        }    
    }
    // Move the head to point to new node
    head = n;       
    }
    public void addToTail(int element) {
        // New Node
        Node n = new Node(element);
        Node end = head;
        n.next = null;
        // If list is empty, make new node the head
        if(head == null) {
            n.prev = null;
            head = n;
            return;
        }
        // Go until you find the last
        while(end.next != null) {
            end = end.next;
        }
        // Change next of the last node
        end.next = n;
        // Make last node the previous of new node
        n.prev = end;
    }
    public void insertNode(Node prev, int element) {
        // Check if the given node is null
        if(prev == null) {
            System.out.println("Cannot have previous node of null");
            return;
        }
        // Create new node and add data
        Node n = new Node(element);
        // Make new node's next the next of the previous
        n.next = prev.next;
        // Make next of prev the new node
        prev.next = n;
        // Make previous node as previous of new nod
        n.prev = prev;
        // Change previous of new nodes next node
        if(n.next != null) {
            n.next.prev = n;
        }
    }
    public void printList(Node node) {
        System.out.println("Going forward --> ");
        Node end = null;
        while(node != null) {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("<-- Going backward ");
        while (end != null) {
            System.out.print(end.data + " ");
            end = end.prev;
        }
    }
}