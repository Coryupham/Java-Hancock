import javax.swing.*;

public class Activity4 extends JFrame {
    public Activity4(){
        super.setTitle("Star Wars Name Generator");
        super.setSize(400, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel(); //call BEFORE setVisible
        super.setVisible(true);
    }

    private void buildPanel(){
        JLabel label1 = new JLabel("Enter your first name\n");
        JTextField firstName = new JTextField("First Name");//You dont have to enter placeholder text but it is nice.
        JLabel label2 = new JLabel("Enter your last name\n");
        JTextField lastName = new JTextField("Last Name");//You dont have to enter placeholder text but it is nice.


        JButton generate = new JButton("Generate Name!");

        firstName.setColumns(25);
        lastName.setColumns(25);

        generate.addActionListener(event ->{
            String firstNameContent = firstName.getText();
            String lastNameContent = lastName.getText();

            try {
                String newName = firstNameContent.substring(0,3) + "-" + lastNameContent.substring(0,2);
                JOptionPane.showMessageDialog(this, newName);
            }catch(StringIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "Out of bounds");}
        });

        JPanel subwindow = new JPanel();
        subwindow.add(label1);
        subwindow.add(firstName);
        subwindow.add(label2);
        subwindow.add(lastName);
        subwindow.add(generate);

        super.add(subwindow);
    }

    public static void main(String[] args) {
        new Activity4();
    }
}
