// Chapter 12, Lesson 4 - Quick Sort Example

public class QuickSortAlgo {
    // Function to partition an element
    int partition(int a[], int start, int end) {
        // Pivot element
        int pivot = a[end];
        int i = (start - 1);
        for(int j = start; j < end - 1; j++) {
            // If current is smaller than pivot
            if(a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }
    // Perform the quicksort using a recursive method
    void quicksort(int a[], int start, int end) {
        if(start < end) {
            int p = partition(a, start, end);
            quicksort(a, start, p - 1);
            quicksort(a, p + 1, end);
        }
    }
    // Print out the list
    private void printList(int a[], int n) {
        int i;
        for(i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {24,2,45,20,56,75,16,56,99,53,12};
        int len = a.length;
        System.out.println("Below is the unsorted list:");
        QuickSortAlgo qs = new QuickSortAlgo();
        qs.printList(a, len);
        qs.quicksort(a, 0, len - 1);
        System.out.println();
        System.out.println();
        System.out.println("Below is the sorted list:");
        qs.printList(a, len);
        System.out.println();
    }
}
