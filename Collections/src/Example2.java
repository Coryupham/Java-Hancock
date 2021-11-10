import java.util.Scanner;
import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How would you like to sort");
        System.out.println("1. Name");
        System.out.println("2. Price");

        int option = keyboard.nextInt();

        TreeSet<Stock> data;
        if(option == 1){
            data = new TreeSet<>(new NameComparator());
        } else if (option == 2){
            data = new TreeSet<>(new PriceComparator());
        } else {
            System.out.println("No option selected");
            data = new TreeSet<>();
        }

        //laod the data
        Stock.load(data);

        data.forEach(current -> System.out.println(current));
    }
}
