import accounts.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000,0.025);
        account.status();
        account.withdraw(1001);
        account.withdraw(100);
        account.deposit(50);

    }
}
