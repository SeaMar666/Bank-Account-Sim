package S1_std;

/**
 * - Create a BankAccount class
 *  - balance:Double
 *  - monthlyDebt:ArrayList<Double>
 *
 * - Implement a bank card given BankCard interface
 * - Implement a credit card given CreditCard interface
 *
 * Use assertion wherever possible.
 * */

public class BankApp {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100);

        BankCard bankCard = new BankCard(bankAccount);
        //bankCard.deposit(-5);
        bankCard.deposit(15);
        //bankCard.withdraw(101);
        //bankCard.withdraw(0);
        bankCard.withdraw(20);
        bankCard.purchase(150.0);



    }

}
