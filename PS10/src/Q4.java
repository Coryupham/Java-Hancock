import java.util.*;

public class Q4 {




    public static void main(String[] args) {
        Map<Long, String> data = new TreeMap<>();
        System.out.println("Enter ten words");
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Long> test = new ArrayList<>();
        for(int x = 0; x < 10; x++){
            boolean isInList = false;
            String input = keyboard.nextLine();
            long hash = HashGenerator.hashCode(input);
            if(!data.containsKey(hash)){
                data.put(hash, input);
            }
        }
        for(Long i : data.keySet()){
            System.out.println("Hash: " + i + " Word: " + data.get(i));
        }
    }
}
