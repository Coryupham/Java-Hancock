import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact> {
    private String name;
    private String number;
    public Contact(String name, String number){
        this.name = name;
        this.number = number;


    }

    public String toString(){
        return name + " " + number;
    }

    @Override
    public int compareTo(Contact o) {
        //compare my name to the other contact's name
        return name.compareTo(o.name);
    }
}
