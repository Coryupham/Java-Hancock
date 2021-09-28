import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example5 extends JFrame implements ActionListener {

    private JRadioButton tax;

    public Example5() {
        this.setTitle("Price Calculator");
        super.setSize(600, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        this.setVisible(true);
    }


    private void buildPanel() {
        JButton pizza = new JButton("Pizza");
        JButton salad = new JButton("Salad");
        JButton soda = new JButton("Soda");


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 3));


        centerPanel.add(pizza);
        centerPanel.add(salad);
        centerPanel.add(soda);

        super.add(centerPanel); // by default, CENTER will be used

        tax = new JRadioButton("Apply Tax");
        JRadioButton noTax = new JRadioButton("No Tax");

        ButtonGroup bg = new ButtonGroup();
        bg.add(tax);
        bg.add(noTax);


        JPanel southernRegion = new JPanel();

        southernRegion.add(tax);
        southernRegion.add(noTax);


        southernRegion.setBorder(BorderFactory.createTitledBorder("Tax Options"));

        super.add(southernRegion, BorderLayout.SOUTH);

        ///////////////////////////////////////////////
        pizza.addActionListener(this);
        salad.addActionListener(this);
        soda.addActionListener(this);

    }

    public static void main(String[] args) {
        new Example5();
    }


    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        double cost = -1;
        if (label.equals("Pizza")) {
            cost = 2;
        } else if (label.equals("Salad")) {
            cost = 5;
        } else if (label.equals("Soda")) {
            cost = 1;
        } else {
            System.out.println("Error: What is that button?");
        }


        if (tax.isSelected()) {
            cost *= 1.08;
        }
        String result = String.format(e.getActionCommand() + "$%.2f",cost);
        JOptionPane.showMessageDialog(this, result);
    }
}
