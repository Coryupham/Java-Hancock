public class Movie implements Comparable<Movie>{


    private String name;
    private int year;
    private String genre;

    public Movie (String name, int year, String genre){
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String toString (){
        return name + " " + year + " " + genre;
    }

    @Override
    public int compareTo(Movie o) {
        if (year < o.year){
            return -1;
        }
        else if (year == o.year){
            return 0;
        } else
            return 1;
    }
}
