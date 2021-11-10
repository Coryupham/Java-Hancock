import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        try {
            long result = Files
                    .lines(Path.of("buzzwords.txt"))
                    .filter(wordFromFile -> wordFromFile.length() > 10)
                    .distinct()
                    .sorted()
                    .peek(current -> System.out.println(current))
                    .count();

            System.out.println("Num result: " + result);


        } catch (IOException e) {
            System.out.println("Could not open file buzzwords.txt");
        }
    }
}
