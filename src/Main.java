import javax.swing.plaf.TableHeaderUI;

class Main {
    public static void main(String[] args)
    {
        CreditCards card1 = new CreditCards("2334-222-3456-2345", 1234);
        CreditCards card2 = new CreditCards("4567-1234-8976-4567", 5643);
        CreditCards card3 = new CreditCards("1234-4567-6789-4322", 45653);

        card1.insertMoney();
        card2.insertMoney();
        card3.withdrawalMoney();

        card1.printCreditCardInfo();
        card2.printCreditCardInfo();
        card3.printCreditCardInfo();
    }
}