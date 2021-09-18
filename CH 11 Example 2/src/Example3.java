import java.io.*;
import java.util.Scanner;

public class Example3 {
    public static void decrypt(int key, String filename) {
        encrypt(-key, filename, "PLAIN");
    }
    public static void encrypt(int key, String filename, String prefix){
        try{
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream inputFile = new DataInputStream(fstream);

            //write the file
            FileOutputStream basic = new FileOutputStream(prefix + " " + filename);
            DataOutputStream writer = new DataOutputStream(basic);

            boolean eof = false;
            while (!eof){
                try{
                    //1 byte = 8 bits
                    //bit = 1 or 0
                    //unsigned = cant go negative
                    int number = inputFile.readUnsignedByte();
                    writer.writeByte(number += key);
                    System.out.println(number);
                }catch (EOFException e){
                    eof = true;
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter filename");
        String fileName = keyboard.nextLine();

        System.out.println("Encrypt or Decrypt");
        String op = keyboard.nextLine();

        System.out.println("Enter a key");
        int key = keyboard.nextInt();

        if(op.equals("encrypt")){
            encrypt(key, fileName, "ENCRYPTED");
        }
        else if (op.equals("decrypt")){
            decrypt(key, fileName);
        }
        else
            System.out.println("Unrecognized operation");
    }
}
