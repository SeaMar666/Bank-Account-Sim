package S1_std;

import java.util.ArrayList;

public class BankAccount{

//Create a BankAccount class
// *  - balance:Double
// *  - monthlyDebt:ArrayList<Double>

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
