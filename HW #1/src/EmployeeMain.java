import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
            System.out.println("-- Employee Entry Form --");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter name");
            String name = keyboard.nextLine();

            System.out.println("Enter ID");
            int ID = keyboard.nextInt();

            System.out.println("Enter department");
            keyboard.nextLine();
            String department = keyboard.nextLine();

            System.out.println("Enter position");
            String position = keyboard.nextLine();

            Employee e1 = new Employee(name, ID, department, position);

            System.out.println("-- Employee Entry Form --");
            System.out.println("Enter name");
            String name2 = keyboard.nextLine();

            System.out.println("Enter ID");
            int ID2 = keyboard.nextInt();

            System.out.println("Enter department");
            keyboard.nextLine();
            String department2 = keyboard.nextLine();

            System.out.println("Enter position");

            String position2 = keyboard.nextLine();

            Employee e2 = new Employee(name2, ID2, department2, position2);

            System.out.println("-- Employee Entry Form --");
            System.out.println("Enter name");
            String name3 = keyboard.nextLine();

            System.out.println("Enter ID");
            int ID3 = keyboard.nextInt();

            System.out.println("Enter department");
            keyboard.nextLine();
            String department3 = keyboard.nextLine();

            System.out.println("Enter position");

            String position3 = keyboard.nextLine();

            Employee e3 = new Employee(name3, ID3, department3, position3);

            System.out.println("        Name           ID   Department     Position");
            //System.out.println("  " + e1.getName() + "         "+ e1.getIdNumber() + "  " + e1.getDepartment() + "     " + e1.getPosition());
            //System.out.println("   " + e2.getName() + "         "+ e2.getIdNumber() + "     " + e2.getDepartment() + "          " + e2.getPosition());
            //System.out.println("  " + e3.getName() + "         "+ e3.getIdNumber() + "     " + e3.getDepartment() + "     " + e3.getPosition());
            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);

    }
}
