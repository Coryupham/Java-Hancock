import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

    private JButton b;
    private int numClicks = 0;

    public ClickListener(JButton b) {
        this.b = b;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(numClicks < 50){
            numClicks++;
        }
        if(numClicks > 50){
            b.setBackground(Color.RED);
            b.setOpaque(true);
            b.setBorderPainted(false);
            b.setForeground(new Color(255,0,255));
        }
        numClicks++;
        b.setText("Num Clicks: " + numClicks);

    }
}
