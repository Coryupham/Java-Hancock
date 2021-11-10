import java.util.Locale;
import java.util.Scanner;

public class CustomHash {

    public static int hashCode (String input){
        int result = 0;
        input = input.toLowerCase(Locale.ROOT);

        for(int x = 0; x < input.length(); x++){
            if(input.charAt(x) == 'a'){
                result += 100;
            } else  if(input.charAt(x) == 'e'){
                result += 200;
            } else  if(input.charAt(x)  == 'i'){
                result += 300;
            } else  if(input.charAt(x) == 'o'){
                result += 400;
            } else  if(input.charAt(x) == 'u'){
                result += 500;
            } else {
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                for(int y = 0; y < alphabet.length(); y++){
                    if(input.charAt(x) == alphabet.charAt(y)){
                        result += (y+1) * (x+1);
                    }
                }}

        }
        return result;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any text");
        String s = keyboard.nextLine();

        System.out.println("The CS112 hashcode for that string is " + hashCode(s));
    }
}
