package calculator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import sun.font.ScriptRunData;

public class Calculatorismail extends JFrame implements KeyListener, ActionListener, MouseListener {

    JPanel main = new JPanel();

    JLabel titletext = new JLabel("Calculator");
    JTextArea txtf = new JTextArea("", 4, 5);
    JTextArea txtf2 = new JTextArea("", 4, 5);
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btndiv = new JButton("/");
    JButton btnmult = new JButton("*");
    JButton btnsub = new JButton("-");
    JButton btnadd = new JButton("+");
    JButton btneql = new JButton("=");

    int string2;
    int string1;
    
    int operation;

    public static void main(String[] args) {
        new Calculatorismail();
    }

    public Calculatorismail() {
        setFont(new Font("Helvetica", Font.BOLD, 24));

        setBounds(100, 100, 250, 250);
        setResizable(false);
        main.setLayout(new FlowLayout());

        txtf.setEditable(false);
        main.add(titletext);
        main.add(txtf);
        add(main);

        Panel numpad = new Panel();
        numpad.setLayout(new GridLayout(4, 2));

        numpad.add(btn9);
        numpad.add(btn8);
        numpad.add(btn7);
        numpad.add(btndiv);
        numpad.add(btn6);
        numpad.add(btn5);
        numpad.add(btn4);
        numpad.add(btnmult);
        numpad.add(btn3);
        numpad.add(btn2);
        numpad.add(btn1);
        numpad.add(btnsub);
        numpad.add(btn0);
        numpad.add(btneql);

        numpad.add(btnadd);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btneql.addActionListener(this);

        btndiv.addActionListener(this);
        btnmult.addActionListener(this);
        btnsub.addActionListener(this);
        btnadd.addActionListener(this);

        numpad.setPreferredSize(new Dimension(250, 150));

        main.add(numpad);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn0) {

            txtf.setText(txtf.getText() + "0");

        } else if (ae.getSource() == btn1) {

            txtf.setText(txtf.getText() + "1");

        } else if (ae.getSource() == btn2) {

            txtf.setText(txtf.getText() + "2");

        } else if (ae.getSource() == btn3) {

            txtf.setText(txtf.getText() + "3");

        } else if (ae.getSource() == btn4) {

            txtf.setText(txtf.getText() + "4");
        } else if (ae.getSource() == btn5) {

            txtf.setText(txtf.getText() + "5");
        } else if (ae.getSource() == btn6) {

            txtf.setText(txtf.getText() + "6");
        } else if (ae.getSource() == btn7) {

            txtf.setText(txtf.getText() + "7");
        } else if (ae.getSource() == btn8) {

            txtf.setText(txtf.getText() + "8");
        } else if (ae.getSource() == btn9) {

            txtf.setText(txtf.getText() + "9");
        } else if (ae.getSource() == btneql) {
            String func = txtf.getText();
            calculatefunct(func);

        } else if (ae.getSource() == btndiv) {
            string1 = Integer.parseInt(txtf.getText());
            txtf.setText(txtf.getText() + " / ");
            operation = 1;
        } else if (ae.getSource() == btnmult) {
            string1 = Integer.parseInt(txtf.getText());
            txtf.setText(txtf.getText() + " * ");
            operation = 2;

        } else if (ae.getSource() == btnsub) {
            string1 = Integer.parseInt(txtf.getText());
            txtf.setText(txtf.getText() + " - ");
            operation = 3;

        } else if (ae.getSource() == btnadd) {
            string1 = Integer.parseInt(txtf.getText());
            txtf.setText(txtf.getText() + " + ");
            operation = 4;

        }

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    private void calculatefunct(String tocal) {
        
//        switch(operation)

    }
}
