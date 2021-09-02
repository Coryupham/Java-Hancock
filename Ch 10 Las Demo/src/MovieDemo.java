import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Movie> movies = loadAllMovies();

        for (Movie m : movies) {
            System.out.println(m);
        }

        MovieReducer oldestMovieFinder = list -> { //This is a lambda expression.
            //list is ArrayList<Movie> (see MovieReducer.java)
            Movie oldest = list.get(0);
            for(Movie current : list)
                if(current.getYear() < oldest.getYear())
                    oldest = current;
            return oldest;
        };

        Movie theOldestMovieFromTheList = oldestMovieFinder.reduce(movies);
        System.out.println("The oldest movie is: ");
        System.out.println(theOldestMovieFromTheList );
    }

    public static ArrayList<Movie> loadAllMovies() throws FileNotFoundException {
        File f = new File("movie_list.txt");
        Scanner inputFile = new Scanner(f);
        ArrayList<Movie> result = new ArrayList<>();
        while (inputFile.hasNextLine()) {
            String name = inputFile.nextLine();
            int year = inputFile.nextInt();
            //skip new line
            inputFile.nextLine();
            String genre = inputFile.nextLine();
            Movie m = new Movie(name, year, genre);
            result.add(m);
        }
        return result;
    }
}
