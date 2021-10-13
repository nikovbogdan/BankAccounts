package accounts;

public class Account {

    protected double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void status() {
        System.out.printf("Your balance is: %.2f\n",balance);
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.printf("Not enough money to complete the operation!!!\nYour balance is: %.2f\n",balance);
            return balance;
        }

        balance -= amount;
        System.out.printf("Withdraw completed!\n\tWithdrawn: %.2f\n\tBalance: %.2f\n",amount,balance);
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposit completed!\n\tDeposited: %.2f\n\tBalance: %.2f",amount,balance);
    }

}
