// Chapter 12, Lesson 3 - Merge Sort Example

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.print("Unsorted Array: ");
        printArray(arr);
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);
        System.out.print("\nSorted Array: ");
        printArray(arr);
    }
    // Function that sorts arr[] using merge()
    void sort(int arr[], int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;   // Find the middle element
            sort(arr, left, mid);           // Sort first half
            sort(arr, mid + 1, right);      // Sort second half
            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }
    // Print the array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Merges two subarrays of arr[], first subarray is arr[left...mid], second subarray is arr[mid + 1...right]
    void merge(int arr[], int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create temporary arrays
        int Left[] = new int [n1];
        int Right[] = new int [n2];
        // Copy data to temporary arrays
        for(int i = 0; i < n1; ++i) {
            Left[i] = arr[left + i];
        }
        for(int j = 0; j < n2; ++j) {
            Right[j] = arr[mid + 1 + j];
        }
        // Merge the temporary arrays
        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = left;
        while(i < n1 && j < n2) {
            if(Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of Left[] if any
        while(i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        // Copy remaining elements of Right[] if any
        while(j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}
