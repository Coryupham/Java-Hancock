public class SmartPhone extends Phone{
    protected String email;
    protected String number;
    protected String name;

    public SmartPhone(){
        //super();
        this.name = "None";
        this.number = "Not set";
        this.email = "None";
    }
    public SmartPhone(String name, String number){
        super(name, Long.parseLong(number));
        this.name = name;
        this.number = number;
        this.email = "None";
    }
    public SmartPhone(String name, String number , String email){
        super(name, Long.parseLong(number));
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String toString(){
        return "Name: " + name + "\nPhone: " + number + "\nEmail: " + email+ "\n";
    }

    public boolean hasPhoneNumber(){
        if (number.equals("Not set")){
            return false;
        }
        else
            return true;
    }

    public String getAreaCode(){
        return number.substring(0,3);
    }

    public String getPrefix(){
        return number.substring(3,6);
    }

    public String getLineNumber(){
        return number.substring(6,10);
    }

    public String getTelephoneNeighbor(){
        if (hasPhoneNumber()){
            long tel = Long.parseLong(number);
            tel += 1;
            String tels = String.valueOf(tel);
            return "(" + tels.substring(0, 3) + ") " + tels.substring(3, 6) + "-" + tels.substring(6, 10);
        }
        return "Cannot calculate phone number neighbor";
    }


    //things ive tried:
    //Casting as long
    //storing number value in new variable in SmartPhone and making a new getNumber function.
        //This needs to return the same data type as the original.
}
