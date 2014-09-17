package javaappletmult;

import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class key extends Applet implements KeyListener {

    String text = "";

    public void init() {
        setBackground(Color.PINK);
        addKeyListener(this);
        requestFocus();
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 100);
    }

    public void keyTyped(KeyEvent e) {
        text = "Key Character = ";
        text = text + e.getKeyChar();
        System.out.println((int)e.getKeyChar());
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        text = "Key Location = ";
        text = text + e.getKeyLocation();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
    }

}
