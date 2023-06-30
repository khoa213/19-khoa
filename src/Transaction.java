public class Transaction {
    public void deposit(Account acc, int money) {
        acc.setBalance(acc.getBalance()+money);
    }
    public void withdraw(Account acc, int money) {
        if (acc.getBalance()<money) {
            throw new RuntimeException("balance is not enough");
        }
        acc.setBalance(acc.getBalance()-money);
    }
}
