import javax.swing.*;

public class Example3 extends JFrame {

    public Example3 (){
        super.setTitle("Click Counter");
        super.setSize(400,200);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPannel();
        super.setVisible(true);
    }

    private void buildPannel(){
        JButton counterButton = new JButton("No clicks yet");
        super.add(counterButton);//by default, go to CENTER


        ClickListener callBack = new ClickListener(counterButton);
        counterButton.addActionListener(callBack);
    }

    public static void main(String[] args) {
    new Example3();
    }
}
