package Employees;

public class Accountant extends Employee{
    public Accountant(String employeeName, int employeeAge) {
        super(employeeName, employeeAge);
        this.jobPosition = "Accountant";
    }

    @Override
    public void printJob() {
        System.out.println("This employee works on a position as a " + this.jobPosition);
    }
}
