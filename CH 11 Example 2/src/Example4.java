import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        ArrayList <Contact> list = new ArrayList<>();

        FileInputStream inputStream = null;
        try {
            //allows reading of binary
            inputStream = new FileInputStream("Contacts.dat");
            //allows reading of objects
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            //read the entire object, cast to correct type
            list = (ArrayList<Contact>)objectInputStream.readObject();//returns Object
            objectInputStream.close();

            System.out.println("Number of existing contacts: " + list.size());
            for(Contact current : list){
                System.out.println(current);// toString
            }
            System.out.println("------");
        } catch (FileNotFoundException e) {
            //do nothing
        } catch (InvalidClassException e){
            System.out.println("The contact data structure changed!");
            System.out.println("Can't load existing list. Starting new list...");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name");
        String name = keyboard.nextLine();
        System.out.println("Enter number");
        String number = keyboard.nextLine();

        Contact c = new Contact(name, number);
        list.add(c);

        //we teach Java how to compare to Contact object
        //by implementing comparable
        Collections.sort(list);

        //Serialization
        //Allows us to take an object (or list of objects) and dump them out on the hard drive.
        try {
            //connect to hard drive, allowing for binary writing
            FileOutputStream outputstream = new FileOutputStream("contacts.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputstream);
            //wite entire list of objects to a file
            objectOutputStream.writeObject(list);
            //close out the file
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
