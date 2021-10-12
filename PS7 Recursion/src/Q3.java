import java.util.Locale;
import java.util.Scanner;

public class Q3 {
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
        reverse(str);
        if(result.toLowerCase(Locale.ROOT).equals(str.toLowerCase(Locale.ROOT))){
            System.out.println("That is a palindrome");
        } else {
            System.out.println("That is NOT a palindrome");
        }

    }
}
