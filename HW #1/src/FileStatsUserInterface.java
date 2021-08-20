import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatsUserInterface {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter a filename");

        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();

        FileStats f1 = new FileStats(fileName);
        int numLines = f1.getNumLines();
        System.out.println(fileName + " has " + numLines + " lines");

        System.out.println("Enter some text");
        String someText = keyboard.nextLine();

        int numWords = f1.getNumMatchingWords(someText);

        System.out.println(numWords + " line(s) contain \"" + someText + "\"");
    }
}
