import java.util.Scanner;

public class CreditCards {
    private String accountNumber;
    private double currentBalance;

    public CreditCards (){
        this.accountNumber = "Unknown";
    }

    public CreditCards (String accountNumber, double currentBalance){
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void printCreditCardInfo(){
        System.out.println("Account number is: "+ this.accountNumber + "\n" + "The current card's balance is: " + currentBalance + "\n");
    }

    public void insertMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter amount of money which you want to insert to your card: ");
        int addedAmountOfMoney = input.nextInt();

        currentBalance += addedAmountOfMoney;

        System.out.println("The updated balance of card after inserting some money: " + currentBalance + "\n");
    }

    public void withdrawalMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter amount of money which you want to insert to your card: ");
        int withdrawalAmountOfMoney = input.nextInt();

        currentBalance -= withdrawalAmountOfMoney;

        System.out.println("The updated balance of card after withdrawal some money: " + currentBalance + "\n");
    }
}
