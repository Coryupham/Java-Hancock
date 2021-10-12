import java.util.Scanner;

public class Example2{
    // Write a method that takes a subscript and returns the corresponding value from the Fibonacci sequence.
    // Ask the user how many Fibonacci number to show.
    // Fibonacci = 0, 1, 1, 2, 3, 5, 8, 13, 21
    // starting point:0, 1
    //base case: x > 1

    public static long fib(int index) {
        if(index == 0 || index == 1){
            return index;
        } else {
            return fib(index-1) + fib(index -2);
        }
    }

    public static void printFibonacciNumbers(int counter, int howMany){
        if (counter < howMany){
            System.out.println(fibShort(counter));
            printFibonacciNumbers(counter + 1, howMany);
        }
    }

    public static long fibShort (int index){
        return index == 0 || index == 1 ? index : fib(index-1) + fib(index -2);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want? ");
        int input = keyboard.nextInt();

        for( int counter = 0; counter < input; counter ++){
            System.out.println(fibShort(counter));
        }
    }
}
