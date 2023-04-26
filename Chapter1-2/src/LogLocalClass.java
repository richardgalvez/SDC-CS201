// Chapter 2, Lesson 9 - Local Class Example

public class LogLocalClass {
    void localMethod() {
        long logID = 2694201337L;
        class LocalClass {      // Local class
            public void display() {
                System.out.println("Inside the local class: " + logID);
            }
        }
        LocalClass local = new LocalClass();
        local.display();
    }
}