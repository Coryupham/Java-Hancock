import javax.swing.*;

public class Example2 extends JFrame {
    public Example2(){
        super.setTitle("Converter");
        super.setSize(400, 200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel(); //call BEFORE setVisible
        super.setVisible(true);
    }

    private void buildPanel(){
        JLabel label = new JLabel("Enter distance in kilometers");
        JTextField field = new JTextField("Write here!");//You dont have to enter placeholder text but it is nice.
        JButton convert = new JButton("Convert");

        field.setColumns(20);
        convert.addActionListener(event ->{
            String inputBoxContent = field.getText();

            try {
                double kilometers = Double.parseDouble(inputBoxContent);
                double miles = kilometers / 1.609;
                String milesAsString = String.format("%.2f", miles);
                JOptionPane.showMessageDialog(this, "Miles: " + milesAsString);
            }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Thats not a number.");}
        });

        JPanel subwindow = new JPanel();
        subwindow.add(label);
        subwindow.add(field);
        subwindow.add(convert);

        super.add(subwindow);
    }

    public static void main(String[] args) {
        new Example2();
    }
}
