// Chapter 7, Lesson 2 - Positional Lists Example

import java.util.*;
public class PositionalList {
    // Initialize everything to 0, head and tail are empty to start
    public int size = 0;
    public Node head = null;
    public Node tail = null;
    public void addNodeAtStart(int data){
        Node n = new Node(data);
        if(size == 0) {
            head = n;
            tail = n;
            n.next = head;
        }
        else {
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
    public void print() {
        System.out.print("Positional List:");
        Node temp = head;
        if(size == 0) {
            System.out.print("List is empty");
        }
        else {
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while(temp != head);
        }
        System.out.println();
    }
    public int elementAt(int index) {
        if(index > size) {
            return -1;
        }
        Node n = head;
        while(index - 1 != 0) {
            n = n.next;
            index--;
        }
        return n.data;
    }
    public static void main(String[] args) {
        PositionalList posList = new PositionalList();
        for (int i = 5; i < 25; i++) {
            posList.addNodeAtStart(i);
        }
        posList.print();
        
        System.out.println("Additionally, the element at the 19th Index is " + posList.elementAt(19) + ".");
    }
    // Create the class for the node
    class Node {
        int data;
        Node next;
        // Constructor to set up the node\
        public Node(int data) {
            this.data = data;
        }
    }
}
