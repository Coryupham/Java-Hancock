public class InsufficientFunds extends Exception{
    private double withdrawAmount;
    public InsufficientFunds (double withdrawAmount){
        super("You dont have enough money");
        this.withdrawAmount = withdrawAmount;
    }
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
}
