import java.util.Scanner;

public class CharacterCounterDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter some text");
        String input = keyboard.nextLine();

        CharacterCounter c = new LetterCounter(input);

        System.out.println("Letter Counter");
        System.out.println(c);
    }
}
