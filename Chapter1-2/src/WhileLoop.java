// Chapter 1, Lesson 2 - While Loop Example

public class WhileLoop {
    public static void main(String[] args) {
        int myNumber = 1;
        while (myNumber < 1000) {
            if ((myNumber % 2) != 0) {
                myNumber++; }
                else {
                    System.out.println(myNumber + " is even, don't you see?");
                    myNumber++;
                }
        }
    }
}