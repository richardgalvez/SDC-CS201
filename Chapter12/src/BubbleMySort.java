// Chapter 12, Lesson 1 - Bubble Sort Example

public class BubbleMySort {
    // First, create the bubble sort using for loops\
    void bubbleSort(int mySimpleArray[]) {
        int n = mySimpleArray.length;
        // The first loop traverses to the end of the list
        for(int i = 0; i < n - 1; i++) {
            // Next, go to the next-to-last element
            for(int j = 0; j < n - i - 1; j++) {
                // Compare: if j (eg., 11) is greater than j+1 (3), then swap.
                if(mySimpleArray[j] > mySimpleArray[j + 1]) {
                    // Swap mySimpleArray [j + 1] and mySimpleArray[j]
                    // These steps create a temporary holding variable, then flip one to the other
                    int temp = mySimpleArray[j];
                    mySimpleArray[j] = mySimpleArray[j + 1];
                    mySimpleArray[j + 1] = temp;
                }
            }
        }
    }
    // This method prints the mySimpleArray
    void printMyArray(int mySimpleArray[]) {
        int n = mySimpleArray.length;
        for(int i = 0; i < n; ++i) {
            System.out.print(mySimpleArray[i] + " ");
        }
        System.out.println();
    }
    // In the main method, call the print method and show the results
    public static void main(String[] args) {
        // Instance of our bubble sort class
        BubbleMySort bubble = new BubbleMySort();
        // Set up the array
        int mySimpleArray[] = {7, 88, 23, 10, 4, 20, 69};
        // Call the bubbeSort function
        bubble.bubbleSort(mySimpleArray);
        System.out.println("Sorted mySimpleArray below:");
        // Call the print function
        bubble.printMyArray(mySimpleArray);
    }
}
