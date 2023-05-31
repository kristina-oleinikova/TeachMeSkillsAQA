package Employees;

public abstract class Employee implements JobDescription{
    private String employeeName;
    private int employeeAge;
    protected String jobPosition;

    public Employee(String employeeName, int employeeAge){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

}
