import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    public static ArrayList<Car> load1()
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            Scanner inputFile = new Scanner(new File("car-list.txt"));
            inputFile.nextLine(); // Get rid of the Make Model Year text in the beginning of the file.

            ArrayList<String> text = new ArrayList<>();


            while (inputFile.hasNextLine())
            {
                String[] wordsArray;
                String tempString = inputFile.nextLine();
                wordsArray = tempString.split("\t");

                cars.add(new Car (wordsArray[0], wordsArray[1], wordsArray[2], wordsArray[3]));
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cars;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What car make are you looking for?");
        String input = keyboard.nextLine();


        ArrayList<Car> car = load1();

        Sort.bubbleSort(car);

        for (Car value : car) {
            if(value.getMake().equalsIgnoreCase(input))
            {
                System.out.println(value);
            }
        }
    }
}
