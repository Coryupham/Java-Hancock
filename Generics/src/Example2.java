import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {


    public static ArrayList<Pair<String, String>> load (){

        ArrayList<Pair<String, String>> data = new ArrayList<>();

        try {
            Scanner inputFile = new Scanner(new File("user-database.txt"));
            while(inputFile.hasNext()){
                //username\tpassword
                String line = inputFile.nextLine();
                //break up the strings by tabs
                String[] tokens = line.split("\t");
                //associate the username and password
                Pair<String, String> user = new Pair<>(tokens[0],tokens[1]);
                //put user in a list
                data.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        ArrayList<Pair<String, String>> users = load();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username");
        String username = keyboard.nextLine();

        Pair<String, String> theUser = null;
        //try to find the user
        for(Pair currentUser : users){
            if(currentUser.getKey().equals(username)){
                theUser = currentUser;
            }
        }
        //if the user was found
        if(theUser != null){
            System.out.println("User found. Enter password");
            String password = keyboard.nextLine();
            if(theUser.getValue().equals(password)){
                System.out.println("Correct");
            }else {
                System.out.println("That is an incorrect password.");
            }
        }else {//user not found
            System.out.println("The user was not found.");
        }

    }
}
