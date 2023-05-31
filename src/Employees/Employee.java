package Employees;

public abstract class Employee implements JobDescription{
    private String employeeName;
    private int employeeAge;

    public Employee(String employeeName, int employeeAge){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;

    }

}
