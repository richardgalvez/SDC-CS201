// Chapter 5, Lesson 5 - Sequential/Linear Search Example

public class Searches {
    public static double sequentialSearch(double[] arr, double key) {
        int arraySize = arr.length;
        for(int i = 0; i < arraySize; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Create an array
        double[] payments = {3.35, 12.07, 122.76, 7.33, 6.04, 681.78, -0.05, 45.25, 107.33, 6.25, 3.45, 3.45, 0.52};

        // What are we looking for?
        double searchKey = 7.33;
        System.out.println("Search Key found at: " + sequentialSearch(payments, searchKey));
    }
}