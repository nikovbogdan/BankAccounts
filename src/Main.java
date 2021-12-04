import accounts.checking.CheckingAccount;
import accounts.savings.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount(1000,1,1);
        SavingsAccount sa = new SavingsAccount(1000,0.025);


        ca.status();
        sa.status();
        System.out.println();
        System.out.println(ca.getRewardPoints());
        System.out.println();
        ca.status();


    }
}
