import javax.swing.*;

public class Example1 {
// Ask the user for a number and show the factorial of that number.

// This code will calculate a factorial using recursion

    public static long factWithIteration(long x){
        long result = 1;
        for(long counter = 1; counter <= x; counter++){
            result *= counter;
        }
        return result;
    }

    public static long factWithRecursion(long counter){
        if(counter >  0){
        return counter * factWithRecursion(counter-1);
        }
        return 1;
    }

    public static long factShort(long counter){
        return counter > 0 ? counter *factShort(counter -1) : 1;
    }

    public static void countDownWithIteration(int x){
        for(int counter = x; counter > 0; counter --){
            System.out.println(counter);
        }
        System.out.println("Blast off!");
    }

    public static void countDown(int x){
        if (x > 0){
            System.out.println(x);
            countDown(x-1);
        }else{
            System.out.println("Blast off!");
        }
    }

    public static void main(String[] args) {
    //countDown(5);
    //countDownWithIteration(5);
        //System.out.println(factShort(5));

        String input = JOptionPane.showInputDialog("Enter a positive integer. I will find the factorial.");
        long converted = Long.parseLong(input);

        long result = factShort(converted);
        JOptionPane.showMessageDialog(null, "Factorial: " + result);
    }
}
