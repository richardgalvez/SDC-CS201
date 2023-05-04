// Chapter 12, Lesson 7 - Sorting & Selection Practical Application Excercise (Merge Sort)

import java.util.Scanner;

public class MergeSortApp {
    private int[] array;
    private int[] tempArray;
    // Public method, this will call the recursive sorting
    public void sort(int[] array) {
        this.array = array;
        this.tempArray = new int[this.array.length];
        mergeSort(0, array.length - 1);
    }
    // Merge Sort method: This will split the array in sub arrays by halves,
    // until it gets to only two items to sort. Then, it will put everything together
    private void mergeSort(int lowIndex, int highIndex) {
        if(lowIndex < highIndex) {
            int pivot = lowIndex + (highIndex - lowIndex) / 2;
            mergeSort(lowIndex, pivot);
            mergeArrays(lowIndex, pivot, highIndex);
            System.out.println("Array Progress:");
            for(int a = lowIndex; a < highIndex; a++) {
                System.out.print(array[a]);
                System.out.print(" ");
            }
            System.out.println();
            mergeArrays(lowIndex, pivot, highIndex);
        }
    }
    // This is the Merge function that will make sure that all the subarrays are in order
    private void mergeArrays(int lowIndex, int pivot, int highIndex) {
        for(int i = 0; i <= highIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowIndex;
        int j = pivot + 1;
        int k = lowIndex;
        while(i <= pivot && j <= highIndex) {
            if(tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            }
            else {
                array[k]= tempArray[j];
                j++;
            }
            k++;
        }
        while(i <= pivot) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
        System.out.println("SubArray Iteration:");
        for(int x: array) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers are you typing? ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter number at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Initial Array:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            System.out.print(" ");
        }

        System.out.println();
        MergeSortApp sort = new MergeSortApp();
        sort.sort(array);
        System.out.println("Final Array:");
        for (int i:array) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}