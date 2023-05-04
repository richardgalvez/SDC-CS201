// Chapter 12, Lesson 2 - Selection Sort Algorithm Example

public class SelectionSortAlgo {
    void sort(int arr[]) {
        int n = arr.length;
        // Traverse the unsorted subarray
        for(int i = 0; i < n - 1; i++) {
            // Find the smallest element in unsorted array
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
                // Swap the smallest element with the first element
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    } 
    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSortAlgo selectSort = new SelectionSortAlgo();
        int arr[] = {95, 42, 13, 9, 23};
        selectSort.sort(arr);
        System.out.println("The sorted array is: ");
        selectSort.printArray(arr);    
    }
}
