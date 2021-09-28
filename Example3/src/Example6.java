import javax.swing.*;
import java.awt.*;

public class Example6 extends JFrame {

    public Example6(){
        this.setTitle("File Chooser");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        this.setVisible(true);
    }

    private void buildPanel(){
       JMenuBar bar = new JMenuBar();
       JMenu file = new JMenu("File");
       JMenuItem item = new JMenuItem("Exit");

       file.add(item);
       bar.add(file);
       super.add(bar, BorderLayout.NORTH);

       item.addActionListener(event -> System.exit(0));


        ////////////////////////////////////

       JTextArea area = new JTextArea();

        area.append("Can you ");
        area.append("see this ");
        area.append("goodbye.");
        super.add(area);
    }

    public static void main(String[] args) {
        new Example6();
    }
}
