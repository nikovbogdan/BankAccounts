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
        fee = cost * 0.01;
        if ((cost + fee) > balance) {
            System.out.printf("Purchase failed!\n\tPurchase cost: %.2f\n\tBalance: %.2f\n\tFee: %.2f\n", cost, balance,fee);
            return balance;
        }
        balance -= cost + fee;
        System.out.printf("Purchase completed!\n\tPurchase cost: %.2f\n\tBalance: %.2f\n\tFee: %.2f\n", cost, balance,fee);
        rewardPoints += cost;
        return balance;
    }
}
