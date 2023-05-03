// Chapter 7, Lesson 1 - Dynamic Array Example

import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList topScores = new ArrayList();
        int buckets = 15;

        Scanner scoreInput = new Scanner(System.in);
        System.out.println("Enter top scores: ");
        int userScore = scoreInput.nextInt();

        for(int i = 0; i < buckets; i++) {
            topScores.add(userScore);
            System.out.println(topScores);
        }
    }
}
