import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {

// use keyboard.next()
    //use try / catch blocks

    public static int greatest;

    public static void getInput (){
        try {
            String input = keyboard.next();
            if(Integer.parseInt(input) > greatest){
                //System.out.println(greatest);
                greatest = Integer.parseInt(input);
                //System.out.println(greatest);
            }
            getInput();
        } catch(NumberFormatException e){
            System.out.println("Greatest number in that sequence is " + greatest);
        }
    }
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter several numbers. Enter a non-integer to end.");
        getInput();
    }
}
