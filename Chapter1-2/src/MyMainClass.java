// Chapter 2, Lesson 9 - Non-Static Nested Class Example (part 2 - main method)

public class MyMainClass {
    public static void main(String[] args) {
        LogFile log = new LogFile();
        LogFile.LogFileDetail logDetail = log.new LogFileDetail();
        logDetail.hello();      // Access the hello method
    }
}