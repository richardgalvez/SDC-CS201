// Chapter 6, Lesson 4 - Stacks, Quesues, & Linked Lists Excercise

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// Class Queue using LinkedList to simulate a queue behavior
class Queue {
    LinkedList<String> queue = new LinkedList<>();
    public void insert (String data) {
        queue.add(data);
    }
    public String retrieve() {
        // Since the idea of retrieving is to remove from the queue, always delete the value
        String value = queue.getFirst();
        queue.removeFirst();
        return value;
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items do you want?");
        int items = scanner.nextInt();
        String[] data = new String[items];
        for(int i = 0; i < data.length; i++) {
            System.out.println("Enter Item " + i);
            data[i] = scanner.next();
        }

        // String[] data = {"A", "B", "C", "D", "E"};
        Queue queue = new Queue();
        // Stack operations for insert and retrieve are push and pop
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < data.length; i++) {
            queue.insert(data[i]);
            stack.push(data[i]);
        }
        System.out.println("Retrieving Queue:");
        // for(int i = 0; i < data.length; i++) 
        while(!queue.isEmpty()) {
            System.out.println(queue.retrieve());
        }

        System.out.println("\n<---------------->\n");
        System.out.println("Retrieving Stack:");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
