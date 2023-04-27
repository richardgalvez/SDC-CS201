// Chapter 3, Lesson 6 - Circular Linked List Example (CLL file)

import java.util.*;
public class CircularLinkedList {
    public int size = 0;
    public Node1 head = null;
    public Node1 tail = null;

    // Print the list
    public void print(){
        System.out.print("The List So Far: ");
        Node1 temp = head;
    do {
        System.out.print(" " + temp.element);
        temp = temp.next;
    } while(temp != head);
    System.out.println();
    }
    // Add a new node at the start (head) of the linked list
    public void addNodeToHead(int element){
        Node1 n = new Node1(element);
        if(size==0) {
            head = n;
            tail = n;
            n.next = head;
        } else{
            Node1 temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
    // Add new note at the end (tail) of the linked list
    public void addNodeToTail(int element){
        if(size==0){
            addNodeToHead(element);
        } else{
            Node1 n = new Node1(element);
            tail.next = n;
            tail = n;
            tail.next = head;
            size++;
        }
    }
    // Add ability for rotation
    public void rotateElement() {
        System.out.println("Rotating!");
        tail = head;
        head = head.next;
    }
    // Remove an element - delete from the tail
    public void deleteNodeFromTail() {
        System.out.println("\nDeleting Node " + tail.element + " from Tail");
            if(tail.next == tail) {
                tail = null;
            }
            Node1 newTail = tail;
        while(newTail.next != tail) {
            newTail = newTail.next;
        }
        newTail.next = tail.next;
        tail = newTail;
    }
    // Delete an element from the head
    public void deleteNodefromHead() {
        head = head.next;
        tail.next = head;
        size--;
    }
}