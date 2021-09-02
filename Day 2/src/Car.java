public class Car implements ComparableYear{
    private int yearConstructed;
    private int yearLastSold;
    private String make;
    private String model;
    private int mileage;

    public Car(int yearConstructed, String make, String model, int mileage, int yearLastSold) {
        this.yearConstructed = yearConstructed;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.yearLastSold = yearLastSold;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString() {
        return yearConstructed + " " + make + " " + model;
    }

    @Override
    public int getYear() {
        return yearConstructed;
    }

    @Override
    public boolean lessThan(ComparableYear other) {
        return yearConstructed < other.getYear();
    }
}
