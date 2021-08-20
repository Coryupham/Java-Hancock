public class Employee {
    String name;
    int idNumber;
    String department;
    String position;

    public Employee(){
        this.name = "(not set)";
        this.idNumber = 0;
        this.department = "(not set)";
        this.position = "(not set)";
    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "(not set)";
        this.position = "(not set)";
    }
    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public int getIdNumber(){
        return idNumber;
    }

    public String toString()
    {
        String result = String.format("%12s", name);
        result += String.format( "%13s", idNumber);
        result += String.format( "%13s", department);
        result += String.format( "%13s", position);


        return result;
    }
}
