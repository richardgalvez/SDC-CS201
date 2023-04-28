// Chapter 7, Lesson 1 - Dynamic Array Example

public class DynamicArray {
    public static void main(String[] args) {
        class TopScores {
            void getScores() {
                // Get and Save Scores here
            }
        }
        TopScores[] topScores = new TopScores[10];
        // Add a new high score, even if array is full we have to make a new array
        int newSize = 15;
        // Make the new one 15
        TopScores[] tempArray = new TopScores[15];
        // New array
        System.arraycopy(topScores, 0, tempArray, 0, newSize);
        topScores = tempArray;

        // Create the array
        private int[] topScores;
    // Create an array that's 1 bucket, a constructor
    public DynamicArray() {
        topScores = new int[1];
    }
    // Pretend we have received another top score, so we'll set out position/bucker in the array to 2
    int bucket = 2;
    public int get(int bucket) {
        if(bucket >= topScores.length) {
            return 0;
        }
        else {
            return topScores[bucket];
        }
    }
    void put(int bucket, int value) {
        if(bucket >= topScores.length) {
            // Already bigger than the array allows, increase the size
            int updatedSize = 2 * bucket;
            int[] newScores = new int[updatedSize];
            System.arraycopy(topScores, 0, newScores, 0, topScores.length);
            topScores = newScores;
            System.out.println("Array increased to " + updatedSize);
        }
    }
    topScores[bucket] = value;
    }
}
