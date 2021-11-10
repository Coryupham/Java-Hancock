import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PrimeNumberGenerator {

    public List<Long> results;

    public static boolean isPrime(int number) {
        for(int check = 2; check < number; ++check) {
            if(number % check == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Long> generate(int howMany){
        List<Long> results = new ArrayList<Long>();

        for(int i = 1; results.size() < howMany; ++i){
            if(isPrime(i + 1)) {
                results.add((long) i + 1);
            }
        }
        return results;
    }
}
