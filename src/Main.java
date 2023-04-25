import java.util.Scanner;

/*
hello world
 */
class Main {
    public static void main(String[] args)
    {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to TeacMeSkills course");

        System.out.print("");
        System.out.println();

        // new line - symbol, \n

        System.out.print("Please, enter your name: " + "Kristina Oleinikova");
        System.out.println();
        System.out.println("Please, enter your surname: ");
        System.out.println("Please, enter your age: ");

        System.out.println("Let's calculate sum of 5 + 10: " + (5 + 10));
        System.out.println("Kristina" + " " + "Oleinikova" +
                ". Welcome to my First " +
                "Lesson to...........");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}