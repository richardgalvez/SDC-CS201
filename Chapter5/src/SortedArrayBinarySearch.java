// Chapter 5, Lesson 3 = Sorted and Unsorted Array Binary Search Example

import java.util.Arrays;
public class SortedArrayBinarySearch {
    public static int recursiveBinarySearch(int[] sortedArray, int begin, int end, int key) {
        if(begin < end) {
            int middle = begin + (end - begin) / 2;
            if(key < sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, begin, middle, key);
            }
            else if(key > sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, middle + 1, end, key);
            }
            else {
                return middle;
            }
        }
        return - (begin = 1);
    }
    public static void main(String[] args) {
        // Establish our sorted array
        int[] sortedArr = {1, 53, 62, 133, 384, 553, 605, 897, 1035, 1234};
        int searchIndex = recursiveBinarySearch(sortedArr, 0, sortedArr.length, 605);
        
        System.out.println("I found 605 at index " + searchIndex + "!");
        
        System.out.println("");
        System.out.println("Now let's try an unsorted array... \n");

        // Binary search with Unsorted array - needs to be sorted first before search
        int[] unsortedArr = {55, 556, 12, 34, 0, 1023, 1567, 32};
        Arrays.sort(unsortedArr);
        System.out.println("Sorting Array First: ");
        for(int i = 0; i < unsortedArr.length; i++) {
            System.out.println("#" + i + " Value = " + unsortedArr[i]);
        }
        int searchIndexU = recursiveBinarySearch(unsortedArr, 0, unsortedArr.length, 1023);
        System.out.println("I found 1023 at index " + searchIndexU + "!");
    }
}