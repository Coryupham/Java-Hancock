import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //when you think of the word static think of the word "share" Static = there is only one copy of it
        // and everyone has to share it.
        System.out.println("Enter a password ");
        int length = keyboard. nextInt();

        Password g = new Password();
        g.generate(length, "");
        System.out.println("Num result: " + g.getNumPasswordsGenerated());
    }
}
