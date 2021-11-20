package S1_std;

public abstract class ABankCard {

    protected final BankAccount bankAccount;

    protected ABankCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Deposit money from account.
     * Returns true for successful operation, false for fail.
    * */
    public abstract boolean deposit(double amount);

    /**
     * Withdraw money from account.
     * Returns true for successful operation, false for fail.
     * */
    public abstract boolean withdraw(double amount);

    /**
     * Make a purchase with given amount.
     * Returns true for successful operation, false for fail.
     * */
    public abstract boolean purchase(double amount);


}
