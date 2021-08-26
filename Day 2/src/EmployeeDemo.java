import java.util.ArrayList;

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> eList = new ArrayList<>();

        //First employee
        Employee e1 = new Employee();
        e1.setSalary(1);
        eList.add(e1);

        //Second employee
        Employee e2 = new Employee("Mark Zuck",123);
        e2.setSalary(500_000_000);
        eList.add(e2);

        //Third employee
        Employee e3 = new Engineer("Steve Wozniak", 456, "BASIC");
        e3.setSalary(100_000);
        eList.add(e3);

        for(Employee current :eList){
            //this is polymorphism
            //current can take on many forms (employee, engineer, or any subclass
            System.out.println(current);//toString
            System.out.println("The person above makes " + current.getSalary() + " per year.");
        }




    }
}
