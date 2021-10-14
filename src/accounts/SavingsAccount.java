package accounts;

public class SavingsAccount extends Account {


    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public double withdraw(double amount) {
        fee = amount * 0.025;
        return super.withdraw(amount);
    }
}
