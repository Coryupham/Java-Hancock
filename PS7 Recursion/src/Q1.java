import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a maximum");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        System.out.println("The sum of number from 1 to " + input + " is " + add(input));
    }

    public static int add(int max){
        int sum = 0;
        if (max != 0 )
        {
            sum += max;
            max--;
            sum += add(max);
        }
        return sum;
    }
}
