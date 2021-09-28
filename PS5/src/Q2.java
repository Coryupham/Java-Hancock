import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a length");
        int userInput = keyboard.nextInt();
        System.out.println("Names of length " + userInput);

        try{
            FileInputStream fstream = new FileInputStream("names.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            int results = 0;
            long keepTrack = 0;
            while (!eof){
                try{
                    int nameLength = inputFile.readInt();
                    keepTrack +=
                    System.out.println(nameLength);
                    if(userInput == nameLength) {
                        StringBuilder name = new StringBuilder("");
                        for (int x = 0; x < nameLength; x++) {
                            name.append(inputFile.readChar());
                        }
                        System.out.println(name);
                        results++;
                    }else{
                       keepTrack
                    }

                } catch (EOFException e) {
                    eof = true;
                }
            }
            System.out.println(results + " results");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
