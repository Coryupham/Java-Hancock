public class NegativeStartingBalance extends Exception{
    private double badBalance;

    public NegativeStartingBalance(double badBalance){
        super("Bad starting balance!");
        this.badBalance = badBalance;
    }
    public double getBadBalance(){
        return badBalance;
    }
}
