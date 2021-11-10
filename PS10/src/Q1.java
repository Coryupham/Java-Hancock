import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {


    public static void main(String[] args) {

        Set<String> data = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //Set<String> data = new TreeSet<>(new MyComparitor());

        Scanner keyboard = new Scanner(System.in);

        boolean exit = false;

        while(!exit){
            System.out.println("Enter a line of text");
            String input = keyboard.nextLine();
            if(input.equals("exit")){
                exit = true;
            } else {
                data.add(input);
            }
        }

        for(String current : data){
            System.out.println(current);
        }
    }
}
