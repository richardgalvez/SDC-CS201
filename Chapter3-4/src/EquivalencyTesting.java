// Chapter 3, Lesson 8 - Equivalency Testing Example using Arrays.equals()

import java.util.Arrays;
public class EquivalencyTesting {
    public static void main(String[] args) {
        int var1[] = {1, 2, 3};     // First array
        int var2[] = {1, 2 ,3};      // Second array

        if (var1 == var2) {
            System.out.println("Equivalent using comparison operator (==)!");
        }
        else {
            System.out.println("Not Equivalent using comparison operator (==)!");
        }

        if (var2.equals(var1)) {
            System.out.println("Equivalent using equals method (x.equals(y))!");
        }
        else {
            System.out.println("Not Equivalent using equals method (x.equals(y))!");
        }
/*
The result for both cases shows that the two arrays var1 and var2 are not equivalent because var2 is a 
reference to a different object from var1. Each of the two variables is a reference to an object which is 
a collection of integer variables. A simple comparison operator like == works best for comparing two 
primitive values like integers.
 */

        if (Arrays.equals(var1, var2)) {
            System.out.println("Equivalent! The Arrays.equals() method is better!");
        } 
        else {
            System.out.println("Not Equivalent!");
        }
    }
/* Arrays.equals() is a java method that performs comparisons on the individual array elements of two arrays 
to be compared. It loops on each index element of the first array and compares it to the matching index 
element in the second array using equals() method. 
 */

}