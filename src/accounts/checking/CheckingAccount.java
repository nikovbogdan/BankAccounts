package accounts.checking;

import accounts.Account;

public class CheckingAccount extends Account {

    private int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void status() {
        System.out.print("Checking Account");
        System.out.printf("\n\tBalance: %.2f\n\tReward Points: %d\n", balance, rewardPoints);
    }

    public double purchase(double cost) {
        fee = cost * 0.001;
        if ((cost + fee) > balance) {
            System.out.printf("Purchase failed!\n\tPurchase cost: %.2f\n\tBalance: %.2f\n\tFee: %.2f\n", cost, balance, fee);
            return balance;
        }
        balance -= cost + fee;
        System.out.printf("Purchase completed!\n\tPurchase cost: %.2f\n\tBalance: %.2f\n\tFee: %.2f\n", cost, balance, fee);
        rewardPoints += calculateRewardPoints(cost);
        return balance;
    }

    public int calculateRewardPoints(double cost) {
        return (int) (cost * 10);
    }
}