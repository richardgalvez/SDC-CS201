// Chapter 2, Lesson 9 - Non-Static Nested Class Example (part 1 - class declaration)

public class LogFile {      // Outer class
    int counter = 17;
    public class LogFileDetail {        // Inner class
        public void hello() {
            System.out.println("Detail: " + counter);
        }
    }
}