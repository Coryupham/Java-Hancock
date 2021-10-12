import java.util.Scanner;

public class Q2 {
    //Ask the user for a String. Display that String in reverse. DO NOT USE LOOPS.
private static String result = "";

    public static String reverse (String str){
        if(str == null || str.length() <= 1){
            return result += str;
        } else {
            result += str.charAt(str.length()-1);
            reverse(str.substring(0,str.length()-1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        System.out.println("Here is that String in reverse");
        System.out.println(reverse(str));
    }
}
