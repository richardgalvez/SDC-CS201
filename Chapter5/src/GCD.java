// Chapter 5, Lesson 8 - Practical Application for Recursion Excercise (GCD Code Application)

public class GCD {
    public static void main(String[] args) {
        int a = 108;
        int b = 48;
        System.out.println("GCD of a and b is: " + calcGCD(a, b));
    }
    public static long calcGCD(int a, int b) {
        if(b != 0) {
            return calcGCD(b, a % b);
        }
        else {
            return a;
        }
    }
}