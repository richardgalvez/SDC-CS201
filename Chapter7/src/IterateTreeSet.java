// Chapter 7, Lesson 3 - TreeSet (ascending order) Iterating Set Example

import java.util.*;

public class IterateTreeSet {
    public static void main(String[] args) {
        // Create our TreeSet
        Set <String> trees = new TreeSet();
        trees.add("Larch");
        trees.add("Pine");
        trees.add("Balsam");
        trees.add("Birch");
        trees.add("Ash");
        Iterator <String> ir = trees.iterator();
        // Output will be in ascending order
        while(ir.hasNext()) {
            System.out.println("Iterator Result = " + ir.next());
        }

        System.out.println(" " );

        Set <Double> scores = new TreeSet();
        scores.add(1.59343);
        scores.add(.9934847);
        scores.add(-3.3444);
        Iterator <Double> ir2 = scores.iterator();
        while(ir2.hasNext()) {
            System.out.println("Score: " + ir2.next());
        }
    }
}
