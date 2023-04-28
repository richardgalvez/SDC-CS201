import java.util.Queue;

// Chapter 6, Lesson 2 - Queue Example

import java.util.*;

public class Coffee {
    public static void main(String[] args) {
        // Create Queue and fill with names, printing first name via peek()
        Queue<String> coffeeShop = new LinkedList<>();
        coffeeShop.add("Sally");
        coffeeShop.add("Bobby");
        coffeeShop.add("Mike");
        coffeeShop.add("Dana");
        System.out.println(coffeeShop.peek());

        coffeeShop.remove();
        coffeeShop.remove();
        System.out.println(coffeeShop.element());

        // After the queue is empty based from that last line, an exception is thrown
        coffeeShop.remove();
        coffeeShop.poll();
        coffeeShop.remove();
    }
}
