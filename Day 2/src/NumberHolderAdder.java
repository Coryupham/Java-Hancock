import java.io.FileNotFoundException;

public class NumberHolderAdder extends NumberHolder{

    private String filename;

    public NumberHolderAdder(String filename) throws FileNotFoundException {
        this.filename = filename;
        super.loadAllNumbersFrom(filename);
    }

    @Override
    public int reduce() {
        int acc = 0;
        for (Integer current : super.numbers){
            acc += current;
        }
        return acc;
    }
}
