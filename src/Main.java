import accounts.DiamondCheckingAccount;
import accounts.GoldCheckingAccount;
import accounts.SilverCheckingAccount;

public class Main {
    public static void main(String[] args) {

        SilverCheckingAccount silver = new SilverCheckingAccount(5000,0.025,0);
        GoldCheckingAccount gold = new GoldCheckingAccount(5000,0.025,0);
        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000,0.025,0);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(50);
        gold.purchase(50);
        diamond.purchase(50);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());


    }
}
