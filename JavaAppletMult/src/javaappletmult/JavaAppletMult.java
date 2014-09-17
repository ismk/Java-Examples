package javaappletmult;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JavaAppletMult extends Applet implements ActionListener, KeyListener {

    TextField text1, text2, text3;
    Label multiplylabel;
    Button b1;

    public void init() {
        text1 = new TextField(10);
        add(text1);
        multiplylabel = new Label("*");
        add(multiplylabel);
        text2 = new TextField(10);
        add(text2);
        b1 = new Button("=");
        add(b1);
        b1.addActionListener(this);
        text3 = new TextField(10);
        add(text3);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int product = Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText());
            text3.setText(String.valueOf(product));
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 10) {
            int product = Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText());
            text3.setText(String.valueOf(product));
        }
    }
}
