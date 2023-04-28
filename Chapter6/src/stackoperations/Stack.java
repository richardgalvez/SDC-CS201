// Chapter 6, Lesson 1 - Stack ADT Example (Class file)
// Stack interface that lets you pop, push, peek, and check if empty.

package stackoperations;

public interface Stack {
    // Add to the top
    void push(int plate);
    
    // Remove from the top
    int pop();

    // Look at first item
    int peek();

    // How many elements?
    int size();

    // Is the stack empty?
    boolean isEmpty();
}