import java.util.ArrayList;

public class Car {
    private String make;
    private String model;
    private int year;
    private String VIN;

    public Car(String make, String model, String year, String VIN){
        this.make = make;
        this.model = model;
        this.year = Integer.parseInt(year);
        this.VIN = VIN;
    }

    public Car(String make, String model, String year) {
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

    public String getVIN(){return VIN;}

    public String toString(){
        return String.format("%15s%25s%5s%18s", make, model, year, VIN);
    }
}
