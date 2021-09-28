import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Activity5 extends JFrame implements ActionListener {

    JTextArea area;

    public Activity5(){
        this.setTitle("Ordering Console");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        this.setVisible(true);
    }

    public void buildPanel(){
        JButton burger = new JButton("Burger $3");
        JButton salad = new JButton("Salad $2");
        JButton soda = new JButton("Soda $1");

        area = new JTextArea();
        area.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16)
        );
        super.add(area);

        JPanel southernRegion = new JPanel();
        southernRegion.add(burger);
        southernRegion.add(salad);
        southernRegion.add(soda);

        area.setBorder(BorderFactory.createTitledBorder("Food Ordered"));
//        super.add(area, BorderLayout.NORTH);
        super.add(southernRegion, BorderLayout.SOUTH);


        ////////////////////////////////////
        burger.addActionListener(this);
        salad.addActionListener(this);
        soda.addActionListener(this);
    }

    public static void main(String[] args) {
        new Activity5();
    }
private double cost = 0;



    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        String result = "";

        if (label.equals("Burger $3")) {
            cost += 3;
            result += "Burger" + String.format("%20s","$") + String.format("%.2f\n", cost);
            area.append(result);
        } else if (label.equals("Salad $2")) {
            cost += 2;
            result += "Salad" + String.format("%21s","$") + String.format("%.2f\n", cost);
            area.append(result);
        } else if (label.equals("Soda $1")) {
            cost += 1;
            result += "Soda" + String.format("%22s","$") + String.format("%.2f\n", cost);
            area.append(result);
        } else {
            System.out.println("Error: What is that button?");
        }
    }
}
