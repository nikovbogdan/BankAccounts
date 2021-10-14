import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(100,0.01,1);
        SavingsAccount sa = new SavingsAccount(100,0.01);

        ca.withdraw(10);
        sa.withdraw(10);

        ca.purchase(12);

    }
}
