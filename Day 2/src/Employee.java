public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(){
        this.name = "Not Set";
        this.id = -1;
    }

    public Employee(String name){
        this.name = name;
        this.id = -1;
    }

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return name + " ID: " + id;
    }

    public void setSalary(double s){
        if(s > 0){
            salary = s;
        }
    }

    public String getSalary(){
        String result = String.format("%.2f", salary); //the percent is to provide a template, the .2 is to tell you want two places after the decimal point
        return result;
    }

}
