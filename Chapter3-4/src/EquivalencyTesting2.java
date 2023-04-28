// Chapter 3, Lesson 8 - Equivalency Testing Example (Using differing data types)

import java.util.Arrays;
public class EquivalencyTesting2 {
    public static void main(String[] args) {
        Object[] studentPositions = {1, 2, 3};
        String[] studentClassPostions = {"1", "2", "3"};

        if (Arrays.equals(studentPositions, studentClassPostions)) {
            System.out.println("Same Students Position List");
        }
        else {
            System.out.println("Different Students Position List");
        }
    }
}