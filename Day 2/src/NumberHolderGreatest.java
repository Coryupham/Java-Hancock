import java.io.FileNotFoundException;

public class NumberHolderGreatest extends NumberHolder {
    public NumberHolderGreatest(String s) throws FileNotFoundException {
        super.loadAllNumbersFrom(s);

    }
    public int reduce(){
        int greatest = super.numbers.get(0); //gets the first item in the array list
        for (int sub = 1; sub < super.numbers.size(); sub++){
            int current = super.numbers.get(sub);
            if(current > greatest){
                greatest = current;
            }
        }
        return greatest;
    }
}
