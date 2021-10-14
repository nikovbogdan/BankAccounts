package accounts;

public class Account {

    protected double balance;
    private double interestRate;
    protected double fee = 0;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void status() {
        System.out.printf("Your balance is: %.2f\n",balance);
        System.out.println();
    }


    public double withdraw(double amount) {
        if ((amount + fee) > balance) {
            System.out.printf("Not enough money to complete the operation!!!\nYour balance is: %.2f\n\tFee: %.2f\n",balance,fee);
            return balance;
        }

        balance -= amount + fee;
        System.out.printf("Withdraw completed!\n\tWithdrawn: %.2f\n\tBalance: %.2f\n\tFee: %.2f\n",amount,balance,fee);
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposit completed!\n\tDeposited: %.2f\n\tBalance: %.2f",amount,balance);
    }

}
