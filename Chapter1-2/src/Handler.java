// Chapter 2, Lesson 7 - Exception Handling Example

public class Handler {
    public static void main(String[] args) {
        // Array size = 5
        int[] numbers = new int[5];
        try {
            // Loop past the last array item
            for (int i = 0; i < 15; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Gotcha!");
        }
    }
}
