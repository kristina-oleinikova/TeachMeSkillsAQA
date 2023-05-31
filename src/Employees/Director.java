package Employees;

public class Director extends Employee{
    public Director(String employeeName, int employeeAge) {
        super(employeeName, employeeAge);
        this.jobPosition = "Director";
    }

    @Override
    public void printJob() {
        System.out.println("This Employee works on a position as a " + this.jobPosition);
    }
}
