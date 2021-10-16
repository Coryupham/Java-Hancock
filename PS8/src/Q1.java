import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {


    public static ArrayList<Car> load1()
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            Scanner inputFile = new Scanner(new File("cars.txt"));
            inputFile.nextLine(); // Get rid of the Make Model Year text in the beginning of the file.

            ArrayList<String> text = new ArrayList<>();


            while (inputFile.hasNextLine())
            {
                String[] wordsArray;
                String tempString = inputFile.nextLine();
                wordsArray = tempString.split("\t");

                cars.add(new Car (wordsArray[0], wordsArray[1], wordsArray[2]));
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> car = load1();

        for (Car value : car) {
            System.out.println(value);
        }
    }
}
