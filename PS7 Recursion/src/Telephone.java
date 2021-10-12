import java.util.ArrayList;
import java.util.Locale;

public class Telephone {

    public ArrayList<String> letterPossibilities = new ArrayList<String>();

    String[] mapping = {
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };


    public Telephone(String phone) {

        generate(phone, phone.length(), "", 0, 0);
    }


//    private void processAll(int x, int maxLength, String result){
//        if(x < selectedCharacters.lenght()){
//            generate(maxLength, result + selectedCharacters.charAt(x));
//            processAll(x+1, maxLength, result);
//
//        }
//    }

    public void generate(String phone, int maxLength, String result, int counter, int letterCounter) {
        if (result.length() < maxLength) {
            char current = phone.charAt(counter);
            int digit = Integer.parseInt("" + current);
            String subset = mapping[digit];
            // add the first letter of the subset to a result

            //Check to see if there is another digit in "phone"
                //if another digit, then call recursive method with a new subset
            generate(phone, maxLength, result + subset.charAt(0), counter + 1, letterCounter);
            generate(phone, maxLength, result + subset.charAt(1), counter + 1, letterCounter);
            generate(phone, maxLength, result + subset.charAt(2), counter + 1, letterCounter);



        } else {
            letterPossibilities.add(result);
        }
    }


    public ArrayList<String> getPossibilities() {
        return letterPossibilities;
    }
}
