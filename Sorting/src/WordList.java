import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
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

    data.clear();

    Random rng = new Random();
    System.out.println("Loading numbers...");

    for (int counter = 1; counter <= 1_000_000; counter++){
      data.add("" + rng.nextInt());
      System.out.println("At: " + counter);
    }
    System.out.println("Done Loading");

    //Call your search method here!
    //Sort.bubbleSort(data);
    //Sort.selectionSort(data);
    //Sort.insertionSort(data);
      Sort.quickSort(data);
int counter = 0;
    for (String word : data)
    {
      System.out.println(word);
      counter++;
    }
    System.out.println(counter);
  }
}
