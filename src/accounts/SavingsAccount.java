package accounts;

public class SavingsAccount extends Account {


    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public double withdraw(double amount) {
        fee = amount * 0.0025;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        amount += amount * 0.001;
        super.deposit(amount);
    }
}
