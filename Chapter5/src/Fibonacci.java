public class Fibonacci {
    static int a = 1, b = 1, c = 0;
    static void printFibonacci(int count) {
        if(count > 0) {
        // c is the sum of the previous two
            c = b + a;
        // a is the new b (as we shift down the line)
            a = b;
        // b is the new a
            b = c;
            System.out.print(" " + c);
            printFibonacci(count - 1);
        }
    public static void main(String[] args) {
        // Fibonacci Series
            System.out.println("\n");
            System.out.println("***** FIBONACCI SERIES BELOW ***** \n");
            int count1 = 11;
            System.out.print(a + " " + b);
            // count - 2 since we already showed 2 numbers
            printFibonacci(count1 - 2);
            System.out.println("");
        }
    }
}