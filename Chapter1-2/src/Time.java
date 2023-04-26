// Chapter 2, Lesson 5 - Abstract Data Type (ADT) Example

import java.time.*;
public class Time {
    private int hour;
    private int minute;
    private int second;
    private LocalDateTime time;
    public Time(LocalDateTime time) {
        this.time = time;
    }
public int getHour() {
    return time.getHour();
}
public int getMinute() {
    return time.getMinute();
}
public int getSecond(){
    return time.getSecond();
}
public static void main(String[] args) {
    Time timeLogged = new Time(LocalDateTime.now());
    int thisHour = timeLogged.getHour();
    System.out.println("The current hour is " + thisHour + ".");
    }
}