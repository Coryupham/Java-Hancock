import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordList
{
  public static ArrayList<String> load()
  {
    ArrayList<String> words = new ArrayList<String>();
    try {
      Scanner inputFile = new Scanner(new File("words.txt"));
      while (inputFile.hasNextLine())
      {
        words.add(inputFile.nextLine());
      }
      inputFile.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return words;
  }

  public static void main(String[] args)
  {
    ArrayList<String> data = load();

    //Call your search method here!
    //Sort.bubbleSort(data);
    Sort.selectionSort(data);
int counter = 0;
    for (String word : data)
    {
      System.out.println(word);
      counter++;
    }
    System.out.println(counter);
  }
}
