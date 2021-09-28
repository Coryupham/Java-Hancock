import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        int total = 0;
        String string = "";
        while(exit != true){
        try {
            System.out.println("Enter a integer");
            string = keyboard.nextLine();
            total += Integer.parseInt(string);
            System.out.println("Current sum: " + total);
        }catch(NumberFormatException e){
            try {
                int input = Integer.parseInt(string.replaceAll("[^0-9]", ""));
                System.out.println("Well, that's not a number but here's what I extracted: " + input);
                total += input;
                System.out.println("Current sum: " + total);

            }catch(NumberFormatException e2){
                exit = true;
            }
        }
        }
        System.out.println("There were no digits in that input.");
        System.out.println("Final sum: " + total);

    }
}
