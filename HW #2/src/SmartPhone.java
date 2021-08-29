public class SmartPhone extends Phone{
    protected String email;
    protected String numb;

    public SmartPhone(){
        super();
    }
    public SmartPhone(String name, String number , String email){
        super(name, Long.parseLong(number));
        this.email = email;
    }

    public String toString(){
        return "Name: " + getName() + "\nPhone: " + getNumber() + "\nEmail: " + email;
    }

    //things ive tried:
    //Casting as long
    //storing number value in new variable in SmartPhone and making a new getNumber function.
        //This needs to return the same data type as the original.
}
