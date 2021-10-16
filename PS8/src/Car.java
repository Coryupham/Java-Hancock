import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = Integer.parseInt(year);
    }

    public String getmodel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return String.format("%15s%25s%5s", make, model, year);
    }
}
