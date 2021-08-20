import java.util.Scanner;

public class EssayDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("English Essay Grader v1.0");
        System.out.println("Enter grammar score (max 30)");
        int grammar = keyboard.nextInt();
        System.out.println("Enter spelling score (max 20)");
        int spelling = keyboard.nextInt();
        System.out.println("Enter length score (max 20)");
        int length = keyboard.nextInt();
        System.out.println("Enter content score (max 30)");
        int content = keyboard.nextInt();

        Essay e = new Essay(grammar, spelling, length, content);
        System.out.println("Your grade: " + e.getGrade());
        System.out.println("Here is you grade breakdown ");
        System.out.println(e); //will auto call toString

    }
}
