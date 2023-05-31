package Employees;

public class MyMain {
    public static void main(String[] args) {
        printPositionsOfEmployee(createArray());
    }

    public static Employee[] createArray(){
        Employee[] employee = {
                new Director("Ivan", 53),
                new Accountant("Valeria", 24),
                new Worker("Semen", 45)
        };
            return employee;
    }

    public static void printPositionsOfEmployee(Employee [] employees){
        for(Employee value : employees){
            value.printJob();
        }
    }


}
