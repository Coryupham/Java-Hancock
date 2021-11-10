import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Employee {

    String id, firstName, lastName, email;

    public static Map<String, Employee> load() {
        //stores data as key-value pairs
        Map<String, Employee> data = new HashMap<>();
        try {
            Scanner inputFile = new Scanner(new File("employees.txt"));
            inputFile.nextLine();
            while (inputFile.hasNext()) {
                Employee s = new Employee(inputFile.nextLine().split("\t"));
                //associate the ticker with the stock object
                // GOOG -> {GOOG, 5.43, "Google", "Technology"}


                data.put(s.id, s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public Employee(String[] tokens) {
        this.id = tokens[0];
        this.firstName = tokens[1];
        this.lastName = tokens[2];
        this.email = tokens[3];
    }

    public String toString(){
        return "" + id + " -> " + firstName + " " + lastName + " " + email;
    }
}
