// Chapter 5, Lesson 8 - Practical Application for Recursion Excercise

/*

You will be creating a program that generates the factorial of a given number. 

A factorial is expressed in math as:

n! = n ∗ (n - 1) ∗ (n - 2) ∗ … ∗ (2) ∗ (1)

What this means is that the number is a product of all positive integers that 
are less than or equal to n. 

Five factorial is written as:

5! = 5 x 4 x 3 x 2 x 1

The final answer is 120.

For this exercise, you should be able to create a new program in Java, declare variables, methods, 
and display output to the screen. You should also have an understanding of 
logic testing (if/then/else statements), and modulo division. 

 */

import java.util.*;

public class Recursion {
    public static void main(String[] args) {


        System.out.println("Enter Integer for Factorial: ");
        Scanner newInput = new Scanner(System.in);
        int tester = newInput.nextInt();

            System.out.println("The facorial of " + tester + " - " + calcFactorial(tester));
    }
    public static long calcFactorial(int input) {
        if(input == 1 ) {
            return 1;
        }
        return input * calcFactorial(input - 1);
    }
}