// Chapter 3, Lesson 3 - Binary Search Example using java.util.Arrays

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array);
        System.out.println("Completeley Sorted: " + Arrays.toString(array));
        int index = Arrays.binarySearch(array, 42);
        System.out.println("Position for number 42 is: " + index);
    }
}
