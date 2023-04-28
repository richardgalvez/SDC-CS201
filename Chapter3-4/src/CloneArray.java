// Chapter 3, Lesson 9 - Array Cloning Example

public class CloneArray {
    public static void main(String[] args) {
        // First array
        int[] highScores2 = {100, 150, 275, 300, 525};
        int[] cloneMe = highScores2.clone();

        for (int i = 0; i < highScores2.length; i++) {
            System.out.println("Original: " + highScores2[i] + " Cloned: " + cloneMe[i]);
        }
    }
}