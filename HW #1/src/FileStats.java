import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {
    private String filename;

    public FileStats(String f)
    {
        filename = f;
    }

    public int getNumLines() throws FileNotFoundException {
        //make a variable to hold the filename
        File fileObj = new File(filename);
        //open the file
        Scanner inputFile = new Scanner(fileObj);
        //keep track of the number of lines
        int numLines = 0;
        //while there's more stuff to read...
        while (inputFile.hasNext())
        {
            //read a line
            String line = inputFile.nextLine();
            //keep track of that line
            numLines++;
        }
        //close the file
        inputFile.close();
        //return the result
        return numLines;
    }

    public int getNumMatchingWords(String wordToSearch)
            throws FileNotFoundException {
        //make a variable to hold the filename
        File fileObj2 = new File(filename);
        //open the file
        Scanner inputFile2 = new Scanner(fileObj2);
        //keep track of the number of lines
        int numWordsMatching = 0;
        //while there's more stuff to read...
        while (inputFile2.hasNext())
        {
            //read a word
            //String words = inputFile2.next();
            String words = inputFile2.nextLine();
            //System.out.println(words);
            //keep track of that word
            //if (words.equals(wordToSearch))
            if(words.toLowerCase().contains(wordToSearch.toLowerCase()))
            {
                numWordsMatching++;
                //System.out.println(numWordsMatching);
            }

        }
        //close the file
        inputFile2.close();
        //return the result
        return numWordsMatching;
    }
}
