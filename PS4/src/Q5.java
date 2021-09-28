import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a filename");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();


        try{
            FileInputStream fstream = new FileInputStream(fileName);
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;

            while (!eof){
                try{
                    int count = 0;
                    int sum = 0;
                    Long cc = inputFile.readLong();
                    String ccn = (String.valueOf(cc));
                    System.out.print("Credit card number: ");
               for (int x = 0; x< ccn.length(); x++){
                   if(x % 4 == 0 && x != 0){
                       System.out.print(" ");
                   }
                   System.out.print(ccn.charAt(x));
               }
//                    System.out.println("Credit card number: " + ccn.substring(0,4) + " " + ccn.substring(4,8) + " " + ccn.substring(8,12) + " " + ccn.substring(12,15));
                    while(cc > 0){
                        count++;
                        int digit = (int)(cc % 10);
                        //System.out.println(digit);
                        if(count % 2 == 0 && count != 1){
                            //System.out.println(digit);
                            digit = digit * 2;
                            //System.out.println(digit);
                            if (digit >= 10){
                                //System.out.println(digit);
                               digit = digit -9;
                                //System.out.println(digit);
                            }

                        }
                        //System.out.println(digit);
                        sum = sum + digit;
                        cc = cc/10;
                    }
                    System.out.println("\nChecksum: " + sum);
                    if(sum % 10 == 0){
                        System.out.println("Card status: VALID");
                    }
                    else{
                        System.out.println("Card status: INVALID");
                    }


                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
