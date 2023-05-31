package Employees;

public class MyMain {
    public static void main(String[] args) {
        createArray();
    }

    public static void createArray(){
        Employee employee = new Director("Ivan", 13);

        employee.printJob();
    }
}
