// Chapter 6, Lesson 3 - Double-Endded Queue (Deque) Example

import java.util.*;

public class DEQueue {
    public static void main(String[] args) {
        Deque workQueue = new LinkedList<>();
        workQueue.add("Widget 001");
        workQueue.add("Widget 002");
        workQueue.add("Widget 003");
        workQueue.add("Widget 004");
        workQueue.add("Widget 005");
        System.out.println(workQueue);
        
        System.out.println("Inspecting " + workQueue.peek());
        // Simulated processing of widgets
        int status = 1;
        // Passed inspection - remove from queue
        if(status == 1) {
            workQueue.removeFirst();
            System.out.println("Widget has passed inspection! Removed from Deque.");
        }
        // Minor work required
        else if(status == 0) {
            System.out.println("Widget left at the hed of deque for minor work.");
        }
        // Failed inspection - send to end of queue
        else if(status == -1) {
            Object inspectionItem = workQueue.pollFirst();
            workQueue.addLast(inspectionItem);
            System.out.println("Widget moved to tail of deque for major work...");
        }
        System.out.println(workQueue);

        workQueue.addFirst("Priority Widget 319");
        System.out.println(workQueue);
    }
}
