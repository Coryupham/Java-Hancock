import java.util.Scanner;
public class Activity3 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            //int acc = 0;
            //for (int counter = 1; counter <= 6; counter++){
                System.out.println("Enter a number and I will figure out the data type");
                String rawInput = keyboard.nextLine();
                try {
                    int r = Integer.parseInt(rawInput);
                    System.out.println("That's an integer!");
                }catch (NumberFormatException e){
                    try {
                        long l = Long.parseLong(rawInput);
                        System.out.println("That's an long!");
                    }catch (NumberFormatException e2){
                        try{
                            double d = Double.parseDouble(rawInput);
                            System.out.println("That's a double!");
                        }catch(NumberFormatException e3){
                            System.out.println("IDK Man ¯\\_(ツ)_/¯");
                        }
                    }
                  //  counter--;
                }
            //}
           // System.out.println("Sum: " + acc);

            //this is default behavior
            // 0  means we ended the program successfully
            System.exit(0);
        }
}
