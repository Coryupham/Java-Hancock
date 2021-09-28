import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    private JButton[] buttons = new JButton[9];
    private int turn = 0;

    public String game(int buttonNum) {
        String setButton = "";
        if (turn % 2 == 0) {
            setButton += "X";
            turn++;
        } else if (turn % 2 != 0) {
            setButton += "O";
            turn++;
        }
        return setButton;
    }

    public boolean checkValid(int buttonNum) {
        return (buttons[buttonNum].getText().equals(""));

    }

    public void reset() {
        turn = 0;
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
        }
    }

    public void checkWinner() {
        if (turn == 9) {
            JOptionPane.showMessageDialog(this, "Cats Game");
            reset();
        }
        if (turn > 4) {
            //checks rows
            if (buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText())) {
                String winner = buttons[0].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }

            }
            if (buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText())) {
                String winner = buttons[3].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }
            if (buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText())) {
                String winner = buttons[6].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }

            //checks cols
            if (buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText())) {
                String winner = buttons[0].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }
            if (buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText())) {
                String winner = buttons[1].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }
            if (buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText())) {
                String winner = buttons[2].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }

            //checks diags
            if (buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText())) {
                String winner = buttons[0].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }
            if (buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText())) {
                String winner = buttons[2].getText();
                if (winner != "") {
                    JOptionPane.showMessageDialog(this, "Winner " + winner);
                    reset();
                }
            }
        }
    }


    public TicTacToe() {
        super.setSize(800, 500);
        super.setTitle("Tic Tac Toe");
        //by default, if a window closes, the program still runs
        //"when window closes, stop the program"
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPanel();
        //by default, windows are invisible
        super.setVisible(true);


    }

    private void buildPanel() {
        GridLayout layout = new GridLayout(3, 3);
        super.setLayout(layout);
        ImageIcon image1 = new ImageIcon("file1.jpg");
        ImageIcon image2 = new ImageIcon("file2.jpeg");

        for (int x = 0; x < buttons.length; x++) {
            buttons[x] = new JButton("");
            super.add(buttons[x]);

            int buttonNum = x;
            buttons[buttonNum].addActionListener(event -> {
                Boolean check = checkValid(buttonNum);
                if (check) {
                    String xoro = game(buttonNum);
                    buttons[buttonNum].setText(xoro);
                    if(xoro.equals("X")){
                        buttons[buttonNum].setIcon(image1);
                    }else if(xoro.equals("O")){
                        buttons[buttonNum].setIcon(image2);

                    }

                    checkWinner();
                } else {
                    JOptionPane.showMessageDialog(this, "That spot has already been taken.");
                }
            });
        }

    }


    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();
    }
}

