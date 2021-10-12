import java.util.ArrayList;
import java.util.Locale;

public class Telephone {

    public ArrayList<String> letterPossibilities = new ArrayList<String>();

    String[] mapping = {
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    public Telephone(String phone) {

        generate(phone, phone.length(), "", 0);
    }

    public void generate(String phone, int maxLength, String result, int counter) {
        if (result.length() < maxLength) {
            char current = phone.charAt(counter);
            int digit = Integer.parseInt("" + current);
            String subset = mapping[digit];
            if(digit == 0 || digit == 1){
                generate(phone, maxLength, result + subset.charAt(0), counter + 1);
            } else if (digit == 7|| digit == 9) {
                generate(phone, maxLength, result + subset.charAt(0), counter + 1);
                generate(phone, maxLength, result + subset.charAt(1), counter + 1);
                generate(phone, maxLength, result + subset.charAt(2), counter + 1);
                generate(phone, maxLength, result + subset.charAt(3), counter + 1);
            } else {
                generate(phone, maxLength, result + subset.charAt(0), counter + 1);
                generate(phone, maxLength, result + subset.charAt(1), counter + 1);
                generate(phone, maxLength, result + subset.charAt(2), counter + 1);
            }

        } else {
            letterPossibilities.add(result);
        }
    }

    public ArrayList<String> getPossibilities() {
        return letterPossibilities;
    }
}
