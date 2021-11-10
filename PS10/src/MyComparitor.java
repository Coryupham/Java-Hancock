import java.util.Comparator;

public class MyComparitor implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        if(o1.compareToIgnoreCase(o2) > 0){
            return 1;
        }
        return 0;
    }
}
