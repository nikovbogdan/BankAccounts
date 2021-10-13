package accounts;

public class CheckingAccount extends Account {

    private int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public double purchase(double cost) {
        if (cost > balance) {
            System.out.printf("Purchase failed!\n\t Purchase cost: %.2f\n\tBalance: %.2f\n", cost, balance);
            return balance;
        }
        balance -= cost;
        System.out.printf("Purchase completed!\n\t Purchase cost: %.2f\n\tBalance: %.2f\n", cost, balance);
        rewardPoints += cost;
        return balance;
    }
}
