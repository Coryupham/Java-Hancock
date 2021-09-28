import javax.swing.*;
import java.awt.*;

public class Example4 extends JFrame {

    private JButton b1, b2, b3, b4, b5;


    public Example4(){

        super.setTitle("Layout Demo");


        b1 = new JButton("Test1");
        b2 = new JButton("Test2");
        b3 = new JButton("Test3");
        b4 = new JButton("Test4");
        b5 = new JButton("Test5");
        buildPanelBorderLayout();
        //buildPanelFlowLayout();
        //buildPanelGridLayout();

        super.setVisible(true);


    }

    private void buildPanelGridLayout(){
        GridLayout g = new GridLayout();
        super.setLayout(g);
        super.add(b1);
        super.add(b2);
        super.add(b3);
        super.add(b4);
        super.add(b5);
    }

    private void buildPanelFlowLayout(){
        FlowLayout f = new FlowLayout();
        super.setLayout(f);
        super.add(b1);
        super.add(b2);
        super.add(b3);
        super.add(b4);
        super.add(b5);
    }

    private void buildPanelBorderLayout(){
        BorderLayout b = new BorderLayout();
        super.setLayout(b);
        super.add(b1, BorderLayout.CENTER);
        super.add(b2, BorderLayout.WEST);
        super.add(b3, BorderLayout.EAST);
        super.add(b4, BorderLayout.NORTH);
        super.add(b5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Example4();
    }
}
