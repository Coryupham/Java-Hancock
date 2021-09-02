import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int acc = 0;
        for (int counter =1; counter <= 10; counter++){
            System.out.println("Enter value " + counter);
            String rawInput = keyboard.nextLine();
            try {
                acc += Integer.parseInt(rawInput);
            }catch (NumberFormatException e){
                System.out.println("That's not an integer. Try again!");
                counter--;
            }
        }
        System.out.println("Sum: " + acc);

        //this is default behavior
        // 0  means we ended the program successfully
        System.exit(0);
    }
}
