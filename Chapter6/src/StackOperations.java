// Chapter 6, Lesson 1 - Stack ADT Example (Main Method file)
// This main function is outside the stackoperations package, therefore it needs to use import.
// If it were inside the stackoperations package folder, it can use package stackoperations;.

import stackoperations.*;

public class StackOperations {
    public static void main(String[] args) {
        int plate;
        LinkedStack lottaPlates = new LinkedStack();

        // Let's add some plates
        plate = 25;
        for(int i = plate; i < 150; i++){
            lottaPlates.push(i + 5);
        }

        // Is the stack empty?
        if(lottaPlates.isEmpty()) {
            System.out.println("Empty Stack");
        }
        else {
            // Peek at the top
            System.out.println("Peeking at the top = " + lottaPlates.peek());
        }

        // Show the size
        System.out.println("\nSize of the stack = " + lottaPlates.size());

        // Pop off the top one
        System.out.println("\nPopping the top = " + lottaPlates.pop());

        // We have 125 plates, I want to remove the 50th...
        // Start at the top and pop them off until you get to 50
        for(int j = lottaPlates.size(); j >= 50; j--) {
            System.out.println(lottaPlates.size());
            lottaPlates.pop();
        }
    }
}