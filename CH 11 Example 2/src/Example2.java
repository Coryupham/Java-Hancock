public class Example2 {
    public static void main(String[] args) {
        try {
            BankAccount b1 = new BankAccount(50);
            b1.withdraw(25);
            System.out.println(b1.getBalance());
        } catch (NegativeStartingBalance e) {
            System.out.println(e.getMessage());
            System.out.println(e.getBadBalance());
        } catch (InsufficientFunds e) {
            System.out.println(e.getMessage());
            System.out.println(e.getWithdrawAmount());
        }

        try {
            BankAccount b2 = new BankAccount(100);
            b2.withdraw(150);
            System.out.println(b2.getBalance());
        } catch (NegativeStartingBalance e) {
            e.printStackTrace();
        } catch (InsufficientFunds e) {
            System.out.println(e.getMessage());
            System.out.println(e.getWithdrawAmount());
        }


    }
}
