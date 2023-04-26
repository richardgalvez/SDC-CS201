// Chapter 1, Lesson 2 - Indefinite While Loop Example

public class IndefiniteWhileLoop {
    public static void main(String[] args) {
        final double panicRate = .02;
        int numMinutes;
        numMinutes = 0;
        double totalPanic = 0;
        while (totalPanic <= 1) {
            totalPanic = panicRate * numMinutes;
            numMinutes++;
        }
        System.out.println("Panic will hit 100% after " + numMinutes + " minutes! Watch out!");
    }
}