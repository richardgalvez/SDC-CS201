// Chapter 3, Lesson 2 - java.util.Arrays Example 1

import java.util.Arrays;
public class Sorting1 {
    public static void main(String[] args) {
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
