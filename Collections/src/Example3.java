import java.util.Map;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //Hashmap has instant lookup
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ticker");
        String ticker = keyboard.nextLine();

        Map<String, Stock> data = Stock.loadToMap();
        //no loop! Instant lookup

        Stock value = data.get(ticker);
        System.out.println(value);
    }
}
