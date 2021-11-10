import java.util.ArrayList;
import java.util.Collections;

public class GenericSort {

  public static <T extends Comparable<T>> void bubbleSort(ArrayList<String> data) {
    for (int end = data.size() - 1; end >= 1; end--)
      for (int current = 0; current <= end - 1; current++)
        if (data.get(current).compareTo(data.get(current + 1)) > 0)
          Collections.swap(data, current, current + 1);
  }

  public static void main(String[] args) {
    ArrayList<Movie> movies = new ArrayList<>();

    movies.add(new Movie("Toy Story", 1995, "Animation"));
    movies.add(new Movie("Back to the future", 1985, "Sci-Fi"));
    movies.add(new Movie("The Warriors", 1979, "Action/Adventure"));

    System.out.println("Unsorted List");
    for(Movie current : movies){
      System.out.println(current);
    }

    //This will sort the array list
    Collections.sort(movies); // Only works if Comparable is implemented


    System.out.println("Sorted List");
    for(Movie current : movies){
      System.out.println(current);
    }

  }

}
