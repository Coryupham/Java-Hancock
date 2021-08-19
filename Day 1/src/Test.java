import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What starting value should we use?");
        int input = keyboard.nextInt();

        //h1 now contains: num, plus, display
        Hello h1 = new Hello(input);
        Hello h2 = new Hello();

        h1.plus();
        h1.plus();
        h1.display();

        h2.display();

        System.out.println("h1's num is: " + h1.getNum());
    }

}
