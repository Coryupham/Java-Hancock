import javax.swing.*;

public class Example1A extends JFrame {
    public Example1A(){
        super.setTitle("Basic Window");
        super.setSize(600, 800);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new Example1A();
    }
}
