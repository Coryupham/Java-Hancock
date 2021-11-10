import java.util.ArrayList;

public class MyList <T extends Number> {

    private ArrayList<T> data;

    public MyList(){
        data = new ArrayList<>();
    }

    public void add(T value){
        data.add(value);
    }

    public T getGreatest(){
        T greatest = data.get(0);
        for(T current : data){
            if(current.doubleValue() > greatest.doubleValue()){
                greatest = current;
            }
        }
        return greatest;
    }

}
