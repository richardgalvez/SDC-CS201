// Chapter 3, Lesson 5 - Creating a Linked List Example

// package linkedlists;
import java.util.*;
public class LinkedLists1 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();       // Create the list

        myList.add("I");
        myList.add("S");
        myList.add("T");
        System.out.println("Linked List = " + myList);

        myList.addFirst("L");
        myList.addLast("9");
        System.out.println("Woops we forgot the 'L'! Try again! " + myList);

        myList.remove("9");
        System.out.println("After removal: " + myList);
        Object item = myList.get(2);
        myList.set(2, (String) item + " Changed");
        System.out.println("After the change: " + myList);
    }
}
