package S1_std;

public class BankCard extends ABankCard{

    public BankCard(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public boolean deposit(double amount) {
      assert amount > -1 : "Amount is not enough.";
      assert amount != 0 : "Amount can't be 0 ";

      bankAccount.setBalance((bankAccount.getBalance() + amount));

      return amount > 0;
    }

    @Override
    public boolean withdraw(double amount) {
        assert amount < bankAccount.balance   : "Amount is not enough for withdraw.";
        assert amount != 0 : "Amount can't be 0 ";

        bankAccount.setBalance(bankAccount.getBalance() - amount);

        return amount > 0;
    }

    @Override
    public boolean purchase(double amount) {
        assert bankAccount.balance > amount  : "Amount is not enough for purchase.";
        assert amount != 0 : "Amount can't be 0 ";

        bankAccount.setBalance(bankAccount.getBalance() - amount);

        return amount > 0;
    }
}
