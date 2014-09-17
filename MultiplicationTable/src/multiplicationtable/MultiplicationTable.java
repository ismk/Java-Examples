package multiplicationtable;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame implements ActionListener {

    JTextField[] usrnum = new JTextField[12];
    JTextField[] ansnum = new JTextField[12];
    JLabel[] lbl09 = new JLabel[12];
    JLabel[] multsign = new JLabel[12];
    JLabel[] equalsign = new JLabel[12];
    JLabel inpNum = new JLabel("Enter A Number:");
    JTextArea display = new JTextArea(1, 5);

    public static void main(String[] args) {
        new MultiplicationTable();

    }

    public MultiplicationTable() {
        setLayout(null);

        inpNum.setBounds(0, 0, 150, 30);
        display.setBounds(0, 30, 150, 30);
        add(inpNum);
        add(display);

        JPanel table = new JPanel();
        table.setLayout(new GridLayout(10, 5));
        for (int i = 1; i < 11; i++) {
            usrnum[i] = new JTextField();
            usrnum[i].setPreferredSize(new Dimension(20, 20));
            ansnum[i] = new JTextField();
            lbl09[i] = new JLabel();
            multsign[i] = new JLabel();
            equalsign[i] = new JLabel();
            lbl09[i].setText("" + i);
            multsign[i].setText("x");
            equalsign[i].setText("=");

            table.add(usrnum[i]);
            table.add(multsign[i]);
            table.add(lbl09[i]);
            table.add(equalsign[i]);
            table.add(ansnum[i]);

        }
        table.setBounds(0, 70, 200, 200);
        add(table);
        JButton donebtn = new JButton("Click Here!");
        donebtn.setBounds(50, 300, 100, 25);
        donebtn.addActionListener(this);
        add(donebtn);

        setSize(250, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Pressed");
        calcmult();
    }

    public void calcmult() {
        for (int i = 1; i < 11; i++) {
            usrnum[i].setText(display.getText());
            ansnum[i].setText(String.valueOf(Integer.parseInt(display.getText()) * i));

        }
    }

}
