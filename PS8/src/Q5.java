import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

    public static ArrayList<Car> load1(String input) {
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            Scanner inputFile = new Scanner(new File(input));
            inputFile.nextLine(); // Get rid of the Make Model Year text in the beginning of the file.

            while (inputFile.hasNextLine()) {
                String[] wordsArray;
                String tempString = inputFile.nextLine();
                wordsArray = tempString.split("\t");

                cars.add(new Car(wordsArray[0], wordsArray[1], wordsArray[2], wordsArray[3]));
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cars;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter filename");

        String input = keyboard.nextLine();

        ArrayList<Car> carList = load1(input);

        Sort.selectionSortYear(carList);

//        for(Car currentCar : carList){
//            System.out.println(currentCar);
//        }
//        System.exit(0);

        ArrayList<Car> oldestCars = new ArrayList<Car>();
        oldestCars.clear();
        System.out.println("Oldest cars by make");


        for (int x = 0; x < carList.size(); x++) {
            String makeToCheck = carList.get(x).getMake();
            boolean oldestFound = false;
            x++;
                while (oldestFound == false) {
                    if (x < carList.size()) {
                        if (carList.get(x).getMake().equalsIgnoreCase(makeToCheck)) {
                            x++;
                        } else {
                            //System.out.println(carList.get(x - 1));
                            oldestCars.add(carList.get(x - 1));
                            oldestFound = true;
                            x--;
                        }
                    } else {
                        oldestCars.add(carList.get(x - 1));
                        oldestFound = true;
                    }
                }
        }


int results = 0;
        for (Car value : oldestCars) {
            System.out.println(value);
            results++;
        }
        System.out.println(results + " result(s)");
//        for (Car value : carList) {
//            System.out.println(value);
//        }
    }
}

    //pass through each manufacturer
