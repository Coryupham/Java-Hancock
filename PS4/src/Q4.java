import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter a filename");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int max =0;
        int min = 900000;
        int count = 0;

        try{
            FileInputStream fstream = new FileInputStream(input);
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof){
                try{
                    int number = inputFile.readInt();
                    count ++;
                    if (number >= max){
                        max = number;
                    }else if (number <= min){
                        min = number;
                    }
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Found " + count + " integers.");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
