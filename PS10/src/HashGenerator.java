import java.util.Locale;

public class HashGenerator {

    public static long hashCode (String input){
        long result = 0;
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
}
