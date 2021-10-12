import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
       area.setLineWrap(true);
       JScrollPane scroller = new JScrollPane(area);
       //scroller.add(area);

       super.add(scroller);




        ////////////////////////////////////////////

        JPanel south = new JPanel();
        JButton open = new JButton("Open");
        south.add(open);
        super.add(south, BorderLayout.SOUTH);
        open.setFont(new Font("SansSerif", Font.BOLD, 100));

        open.addActionListener(event -> {
            JFileChooser ch = new JFileChooser();
            int approve = ch.showOpenDialog(this);
            if (approve == JFileChooser.APPROVE_OPTION){
                File f = ch.getSelectedFile();
                try{
                    Scanner inputFile= new Scanner(f);
                    while(inputFile.hasNextLine()){
                        String line = inputFile.nextLine();
                        area.append(line + "\n");
                    }

                }catch (FileNotFoundException e){
                    System.out.println("Could not find file");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Example6();
    }
}
