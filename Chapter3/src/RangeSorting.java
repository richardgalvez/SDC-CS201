// Chapter 3, Lesson 2 - Range Sorting Example with java.util.Arrays

import java.util.Arrays;
public class RangeSorting {
    public static void main(String[] args) {
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array, 4, 8);
        System.out.println("Partially Sorted: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Completely Sorted: " + Arrays.toString(array));
    }
}
