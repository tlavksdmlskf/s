package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println(account.getBalance());
        account.deposit(-1990);
        account.withdraw(10000);
    }
}
