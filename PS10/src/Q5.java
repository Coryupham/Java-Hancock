import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {

    static int numbCustomers = 1;


    public static Map<String, Customer> load(String fileName) {
        //stores data as key-value pairs
        Map<String, Customer> data = new HashMap<>();
        try {
            Scanner inputFile = new Scanner(new File(fileName));
            inputFile.nextLine();
            while (inputFile.hasNext()) {
                Customer s = new Customer(inputFile.nextLine().split("\t"));

                if(data.containsKey(s.getID())){
                    //change the last ballance
                    data.get(s.id).setBallance(s.ballance);
                    //update high ballance if needed
                    if(data.get(s.id).getHigh() < s.getBallance()){
                        data.get(s.id).setHigh(s.getBallance());
                    }
                    //update low ballance if needed
                    if(data.get(s.id).getLow() > s.getBallance()){
                        data.get(s.id).setLow(s.getBallance());
                    }
                } else {
                    data.put(s.id, s);
                    numbCustomers++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }


    public static void main(String[] args) {

        System.out.println("Enter a filename");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();

        Map<String, Customer> data = load(fileName);

       for(int x = 1; x < numbCustomers; x++){
           String xstring = String.valueOf(x);
           System.out.println(data.get(xstring));
       }

    }
}
