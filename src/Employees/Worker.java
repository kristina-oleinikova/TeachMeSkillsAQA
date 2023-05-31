package Employees;

public class Worker extends Employee{
    public Worker(String employeeName, int employeeAge) {
        super(employeeName, employeeAge);
        this.jobPosition = "Worker";
    }

    @Override
    public void printJob() {
        System.out.println("This Employee works on a position as a " + this.jobPosition);
    }
}
