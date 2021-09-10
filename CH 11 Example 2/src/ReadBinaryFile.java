import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile{
    public static void main(String[] args) {
        try{
            FileInputStream fstream = new FileInputStream("numbers.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof){
                try{
                    int number = inputFile.readInt();
                    System.out.println(number);
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
