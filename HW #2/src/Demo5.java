import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("New number creation tool");
        System.out.println("Enter name");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("Enter phone number");
        String number = keyboard.nextLine();
        System.out.println("Enter email");
        String email = keyboard.nextLine();
        SmartPhone test = new SmartPhone(name, number, email);
        System.out.print(test);
        System.out.println("Telephone neighbor: " + test.getTelephoneNeighbor());
    }
}
