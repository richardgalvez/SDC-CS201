// Chapter 2, Lesson 5 - ADT with Interface Example

import java.time.*;
interface Time {
 public int getHour();
 public int getMinute();
 public int getSecond();
}
public class PublicTime implements Time {
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
 public int getSecond() {
  return time.getSecond();
 }
 public static void main(String[] args) {
  PublicTime time_logged = new PublicTime(LocalDateTime.now());
  int this_hour = time_logged.getHour();
  System.out.println(this_hour);
 }
}