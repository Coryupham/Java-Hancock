import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity8
{
  public static String fileName = "";


  public static ArrayList<Integer> load()
  {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    try {
      Scanner inputFile = new Scanner(new File(fileName));
      while (inputFile.hasNext())
      {
        nums.add(inputFile.nextInt());
      }
      inputFile.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return nums;
  }

  public static void main(String[] args)
  {
    System.out.println("Enter a filename");
    Scanner keyboard = new Scanner(System.in);
    fileName = keyboard.nextLine();
    ArrayList<Integer> data = load();

    Sort.insertionSort(data);
    int arraySize = data.size();
    for(int x = 0; x < data.size(); x++) {
      System.out.println(data.get(x));

      if(arraySize >= 0){
        System.out.println(data.get(arraySize - 1));
        arraySize--;
      }
    }

    //System.out.println(counter);
  }
}
