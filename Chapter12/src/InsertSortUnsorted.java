// Chapter 12, Lesson 6 - Insertion Sort Example (Unsorted Recipe Main)

public class InsertSortUnsorted {
    public static void sortRecipe(int sortArray[]) {
        int len = sortArray.length;
        // Start looping through the array
        for(int j = 1; j < len; j++) {
            // Use a temporary variable to keep track
            int temp = sortArray[j];
            // Shifting down, so subtract 1
            int i = j - 1;
            // If we are at -1, we went past the beginning
            // As long as j is > 0 and the current bucket of the array is less than temp varable, shift elements
            while((j > -1) && (sortArray[i] > temp)) {
                sortArray[i + 1] = sortArray[i];
                i--;
            }
            sortArray[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] steps = {1, 7, 9, 11, 4};
        System.out.println("Before Sort: ");
        for(int i = 0; i < steps.length; i++) {
            System.out.println(steps[i] + ") ");
        }

        public static void sortRecipe2(int sortArray[]) {
            // Start looping through the array
            for(int i = 1; i < sortArray.length; i++) {
                // Start again in the array, this time decrementing by 1, until reaching the beginning and
                // the next element is greater than the current
                for(int j = i; (j > 0 && sortArray[j - 1] > sortArray[j]); j--) {
                    // Save a temporary bucket, re-sort elements so the next is greater than the current
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j - 1];
                    sortArray[j - 1] = temp; 
            }
        }
    }
}