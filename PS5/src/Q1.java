import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a balance");
        Scanner keyboard = new Scanner(System.in);
        double input = keyboard.nextDouble();

        System.out.println("Accounts with a balance of at least $" + String.format("%.2f",input));
        System.out.println("         Card Number   Balance  Cash Back?");

        try{
            FileInputStream fstream = new FileInputStream("accounts.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            int results = 0;
            while (!eof){
                try{
                    long creditCard = inputFile.readLong();
                    double balance = inputFile.readDouble();
                    boolean cashBack = inputFile.readBoolean();
                    String stringCashBack = "No";
                    if(cashBack){
                        stringCashBack = "Yes";
                    }

                    if(balance >= input){
                        System.out.println(String.format("%20s", creditCard) + String.format("%10.2f", balance) + String.format("%12s", stringCashBack));
                        results++;
                    }

                } catch (EOFException e) {
                    eof = true;
                }
            }
            System.out.println(String.format("%34s", results) + " results");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
