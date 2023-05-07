import java.util.Scanner;
/*
Homework 3
 */
class Main {
    public static void main(String[] args) {
        getScanner();
        symbolicValue();
        calculateBMI();
    }

/*
Task 1: Создать программу, которая с помощью класса Scanner принимает следующие данные: имя, фамилия, возраст, рост и вес.
Эти данные должны храниться в соответствующих переменных. Используя стандартный вывод выведите информацию следующим образом:
Name: _name
Surname: _surname
Age: _age
Height: _height
Weight: _weight
 */

    public static void getScanner() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = enter.nextLine();
        System.out.print("Enter your surname: ");
        String surname = enter.nextLine();
        System.out.print("Enter your age: ");
        int age = enter.nextInt();
        System.out.print("Enter your height: ");
        float height = enter.nextFloat();
        System.out.print("Enter your weight: ");
        float weight = enter.nextFloat();


        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);

        enter.close();
    }

    /*
    Task 2: Напишите код, который будет принимать один символ и выводить в консоль символическое значение, а напротив его численное.
    Например:
    С - 66
    а - 6
     */

    public static void symbolicValue(){
        Scanner value = new Scanner(System.in);

        System.out.print("Enter alphabetic symbol: ");
        char ch = value.next().charAt(0);

        System.out.println(ch + "-" + (int)ch);
        value.close();
    }

    /*
     Task 3: Напишите код, который принимает на входе следующие значения: вес и  рост.
     После этого выводит на экран т.н. BMI (Body Mass Index).
     Формула: BMI = kg/m2
     */
    public static void calculateBMI() {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        float weight = data.nextFloat();
        System.out.println("Enter your height: ");
        float height = data.nextFloat();
        float height2 = height * height;
        float BMI = weight / height2;

        System.out.println("Your BMI is: " + BMI);
        data.close();
    }
}