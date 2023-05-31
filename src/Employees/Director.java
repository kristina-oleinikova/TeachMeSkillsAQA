package Employees;

public class Director extends Employee{
    private String jobPosition = "Director";
    public Director(String employeeName, int employeeAge) {
        super(employeeName, employeeAge);
    }

    @Override
    public void printJob() {
        System.out.println("This Employee works on a position as a: " + this.jobPosition);
    }
}
