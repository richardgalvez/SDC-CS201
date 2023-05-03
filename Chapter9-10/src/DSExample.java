// Chapter 10, Lesson 5 - Automaitc Ordering using TreeMap Example

import java.sql.PseudoColumnUsage;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class DSExample {
    public static void main(String[] args) {
        // Create a TreeMap
        // Student IDs and money raised
        TreeMap<Integer, Integer> student = new TreeMap<Integer, Integer>();
        student.put(9, 30);
        student.put(10, 25);
        student.put(5, 15);
        student.put(12, 10);
        student.put(8, 40);
        // Now loop through the map
        for(Map.Entry m:student.entrySet()) {
            System.out.println("Key = " + m.getKey() + " Value = " + m.getValue());
        }

        System.out.println("First entry in the database is: " + student.firstEntry());
        System.out.println("First entry in the database is: " + student.lastEntry());
        System.out.println("Greatest ID less than or equal to 6: " + student.floorKey(6));
        System.out.println("Ceiling Key = " + student.ceilingKey(7));
        System.out.println("Try for 9 = " + student.ceilingKey(9));
        System.out.println("Higher Key = " + student.higherKey(10));
        System.out.println("Lower Key = " + student.lowerKey(5));
        System.out.println("The students that volunteered in Grade 5 are: " + student.subMap(10, 20));
    }
}
