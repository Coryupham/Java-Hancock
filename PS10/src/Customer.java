import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {

    public double ballance;
    public double low;
    public double high;
    public String id;


    public Customer(String[] tokens) {
        this.id = tokens[0];
        this.ballance = Double.parseDouble(tokens[1].substring(1));
        this.low = Double.parseDouble(tokens[1].substring(1));
        this.high = Double.parseDouble(tokens[1].substring(1));
    }

    public String getID(){
        return id;
    }
    public double getLow(){
        return low;
    }
    public double getHigh(){
        return high;
    }
    public void setBallance(double newBallance){
        this.ballance = newBallance;
    }
    public double getBallance(){
        return ballance;
    }
    public void setLow(double newLow){
        this.low = newLow;
    }
    public void setHigh(double newHigh){
        this.high = newHigh;
    }
    public String toString(){
        String doubleFormat = String.format("%.2f", ballance);
        return String.format("%s%s%s%.2f%s%.2f%s%.2f", "Customer ", id, ": Last balance: $", ballance, " High balance: $", high, " Low balance: $", low);
       // return "Customer " + id + ": Last balance: $" + doubleFormat + " High balance: $" + high + " Low balance: $" + low;
    }

}
