public class SmartPhone extends Phone{
    protected String email;
    protected String numb;

    public SmartPhone(){
        super();
    }
    public SmartPhone(String name, String number , String email){
        super(name);
        this.email = email;
        numb = number;
    }
    public long getNumber(){
        long l = Long.parseLong( numb );
        return l ;
    }

    public String toString(){
        return "Name: " + getName() + "\nPhone: " + getNumber() + "\nEmail: " + email;
    }

    //things ive tried:
    //Casting as long
    //storing number value in new variable in SmartPhone and making a new getNumber function.
        //This needs to return the same data type as the original.
}