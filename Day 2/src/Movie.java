public class Movie implements ComparableYear {
    private String name;
    private int year;
    private String genre;

    public Movie(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String toString() {
        return name + " " + year + " " + genre;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean lessThan(ComparableYear other) {
        return year < other.getYear();
    }
}
