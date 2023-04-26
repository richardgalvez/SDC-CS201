// Chapter 2, Lesson 3 - Inheritence Example

public class Employee1 {
    private double payRate;
    private String fullName;
    private double FTE;
    float hoursWorked;
    // public void calculatePay() { - before overriding
    public double calculatePay() {      // Override
        return getPayRate() * getFTE() * getHoursWorked();
    }
    public double getPayRate() {
        return payRate;
    }
    public double getFTE() {
        return FTE;
    }
    public float getHoursWorked() {
        return hoursWorked;
    }
}
public class UnionEmployee1 extends Employee1 {
    // Everything from Employee1 will come over
    // New Fields for UnionEmployee1:
    private String bargainingUnit;
    private String unionCode;
    private double unionDues;
    private double getUnionDues() {
        return unionDues;
    }
    //public void calculateUnionDues() {
        // Can use the Employee calc pay
        // Also special calc for dues
    public double calculatePay() {      // Override
        return (super.calculatePay() - getUnionDues());     // Super keyword
    }
}