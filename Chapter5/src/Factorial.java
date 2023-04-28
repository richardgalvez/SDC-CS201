// Chapter 5, Lesson 2 - Calculate Factorial and Fibonacci Series Example

public class Factorial {
    public static void main(String[] args) {
        double tester = 11.00;
        System.out.println("The factorial of " + tester + " = " + calcFactorial(tester) + "!");
    }
    // Add the calcFactorial method; the method that calls itself
    public static double calcFactorial(double input) {
        if(input == 1.0) {
            return 1.0;
        }
        return input * calcFactorial(input - 1.0);
    }
}