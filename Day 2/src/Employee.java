public class Employee {
    private String name;
    private int id;

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

}
