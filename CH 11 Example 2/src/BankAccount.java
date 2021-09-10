public class BankAccount {
    private double balance;

    public BankAccount (double starting) throws NegativeStartingBalance {
        if (starting < 0) {
            throw new NegativeStartingBalance(starting);
        } else {
            balance = starting;
        }
    }
    public void withdraw (double howMuch) throws InsufficientFunds {
        if (howMuch > balance) {
            throw new InsufficientFunds(howMuch);
        } else {
            balance -= howMuch;
        }
    }
    public double getBalance(){
        return balance;
    }
}
