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

    /**
     * Shows account balance and reward points
     */
    @Override
    public void status() {
        System.out.print("Checking Account");
        System.out.printf("\n\tBalance: %.2f\n\tReward Points: %d\n", balance, rewardPoints);
    }

    /**
     * Creating purchase operation from your bank account
     * @param cost the amount of money that withdrawn from your bank account to complete the operation
     */
    public void purchase(double cost) {
        fee = cost * 0.001;
        if ((cost + fee) > balance) {
            System.out.printf("Purchase failed!\n\tPurchase cost: %.2f\n\tFee: %.2f\n\tBalance: %.2f\n", cost, fee, balance);
            return;
        }
        balance -= cost + fee;
        System.out.printf("Purchase completed!\n\tPurchase cost: %.2f\n\tFee: %.2f\n\tBalance: %.2f\n", cost, fee, balance);
        rewardPoints += calculateRewardPoints(cost);
    }

    /**
     * Help method for calculating the reward points after purchase has been made
     * @param cost the amount of money that withdrawn from your bank account to complete the operation
     */
    public int calculateRewardPoints(double cost) {
        return (int) (cost * 1.5);
    }
}
