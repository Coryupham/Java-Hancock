import java.util.ArrayList;

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> eList = new ArrayList<>();

        //First employee
        Employee e1 = new Employee();
        eList.add(e1);

        //Second employee
        Employee e2 = new Employee("Mark Zuck",123);
        eList.add(e2);

        //Third employee
        Employee e3 = new Engineer("Steve Wozniak", 456, "BASIC");
        eList.add(e3);

        for(Employee current :eList){
            System.out.println(current);//toString
        }




    }
}
