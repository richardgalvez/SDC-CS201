// Chapter 2, Lesson 9 - Static Nested Class Example

public class LogFile2 {
    public static class LogFIleDetail {
        public void hello() {
            System.out.println(" It's me, hi! I'm the Inner Class it's me!");
        }
    }
    public static void main(String[] args) {
        LogFile2.LogFIleDetail detail = new LogFile2.LogFIleDetail();
        detail.hello();
    }
}