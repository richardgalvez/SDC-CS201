// Chapter 5, Lesson 7 - Exponential Search Example

import java.util.*;
import java.math.*;

public class ExponentialSearch{
    static int expSearch(int array[], int n, int searchValue) {
        // If value is at postion one
        if(array[0] == searchValue) {
            return 0;
        }
        // Find the range for the binary search
        int i = 1;
        while(i < n && array[i] <= searchValue) {
            i = i * 2;
        }
        // Now call the binary Search
        return Arrays.binarySearch(array, (i / 2), Math.min(i, n), searchValue);
    }
    public static void main(String[] args) {
        int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        // Looking for 50
        int searchValue = 50;
        int result = expSearch(array, array.length, searchValue);
    
        System.out.println("Element is present at index: " + result + "!");
    }
}