import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        getPersonalData();
        symbolicValue();
        calculateBMI();
    }

    public static void getPersonalData() {
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
    }

    public static void symbolicValue(){
        Scanner value = new Scanner(System.in);

        System.out.print("Enter alphabetic symbol: ");
        char ch = value.next().charAt(0);

        System.out.println(ch + "-" + (int)ch);
    }

    public static void calculateBMI() {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        float weight = data.nextFloat();
        System.out.println("Enter your height in meters: ");
        int height = data.nextInt();
        double height2 = (float)height/100;
        double BMI = weight / (height2*height2);

        System.out.println("Your BMI is: " + BMI);
        data.close();
    }
}