// Chapter 7, Lesson 1 - Dynamic Array Example (TopScores Class)

public class TopScores {
    class TopScores {
        void getScores() {
            // Get and save scores here
        }
    }
    // Create our array to get top scores
    TopScores[] topScores = new TopScores[10];
    // Add a new high score, even if the array is full
    // We have to make a new array
    int newSize = 15;
    // Make the new one 15
    TopScores[] tempArray = new TopScores[15];
    // New array
    System.arraycopy(topScores, 0, tempArray, 0, newSize);
    topScores = tempArray;

    // Create the array
    private int[] topScores;
    // We'll create an array that's 1 bucket, this is called a constructor
    public DynamicArray() {
        topScores = new int[1];
    }
    // Let's pretend we have received another top score, so we'll set out position/bucket in the array to 2
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
            // We're already bigger than the array allows; increase the size
            int updatedSize = 2 * bucket;
            int[] newScores = new int [updatedSize];
            System.arraycopy(topScores, 0, newScores, 0, topScores.length);
            topScores = newScores;
            System.out.println("Array increased to " + updatedSize);
        }
        topScores[bucket = value];
    }
    // Boss wants another bucket, create instance of DynamicArray
    DynamicArray reupdatedHighScores = new DynamicArray();
    reupdatedHighScores.put(15, value);
}