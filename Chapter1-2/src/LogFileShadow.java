// Chapter 2, Lesson 9 - Shadowing Example (classes only)

public class LogFileShadow {        // Outer class variable
    int counter = 17;
    public class LogFileDetail {
        int counter = 25;
        public void hello() {
            System.out.println("Outer: " + LogFileShadow.this.counter);
            System.out.println("Inner: " + this.counter);
        }
    }
}