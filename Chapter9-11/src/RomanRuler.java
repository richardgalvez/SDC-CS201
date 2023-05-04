// Chapter 9, Lesson 2 - Priority Queue Unsorted List Example
// Augustus would be removed from the priority queue, not because he was the first one 
// in the queue, but because he has the highest priority based on natural order.

import java.util.*;

public class RomanRuler {
    public static void main(String[] args) {
        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
        myPriorityQueue.add("Augustus");
        myPriorityQueue.add("Tiberius");
        myPriorityQueue.add("Caligula");
        myPriorityQueue.add("Claudius");
        myPriorityQueue.add("Nero");
        myPriorityQueue.add("Galba");
        myPriorityQueue.add("Otho");
        myPriorityQueue.add("Aulus Vitellius");
        myPriorityQueue.add("Vespasian");
        myPriorityQueue.add("Titus");
        myPriorityQueue.add("Domitian");
        myPriorityQueue.add("Nerva");

        myPriorityQueue.remove();
        System.out.println(myPriorityQueue);
    }
}
