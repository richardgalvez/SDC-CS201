// Chapter 5, Lesson 6 - Binary Search Example

public class BinarySearch2 {
    class binarySearch {
        // Returns an index of x if it is still present in arr[l..r], else return -1
        public static int binarySearch(int arr[], int l, int r, int x) {
            if(r >= 1) {
                int mid = l + (r - l) / 2;
                // If the element is present at the middle itself
                if(arr[mid] == x) {
                    return mid;
                }
                // If the element is smaller than mid, then it can only be present in the left subarray
                if(arr[mid] > x) {
                    return binarySearch(arr, l, mid - 1, x);
                }
                else {
                    return binarySearch(arr, mid + 1, r, x);
                }
            }
            return -1;
        }
        // Driver method to test above
        public static void main(String[] args) {
            binarySearch ob = new binarySearch();
            int arr[] = {20, 30, 40, 50, 80, 90, 100};
            int n = arr.length;
            int x = 40;
            int result = ob.binarySearch(arr, 0, n - 1, x);
            if(result == -1) {
                System.out.println("Element not present...");
            }
            else {
                System.out.println("Element found at index " + result + "!");
            }
        }
    }
}