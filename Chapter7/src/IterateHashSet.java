// Chapter 7, Lesson 3 - HashSet (unordered) Iterating Set Example

import java.util.*;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create our HashSet
        Set <String> trees = new HashSet();
        trees.add("Larch");
        trees.add("Pine");
        trees.add("Balsam");
        trees.add("Birch");
        trees.add("Ash");
        // Iterate over set - the for loop establishes the type (String), a counter (s), and the Set (trees)
        for(String s: trees) {
            System.out.println("Tree = " + s);
        }

        System.out.println(" " );
        trees.forEach(System.out::println);
        System.out.println(" " );

        // Use Iterator interface (part of Collections class)
        Iterator <String> ir = trees.iterator();
        while(ir.hasNext()) {
            System.out.println("Iterator Result = " + ir.next());
        }
    }
}
