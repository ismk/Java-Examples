package javaappletmult;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvt extends Applet implements MouseListener, MouseMotionListener {

    String msg = " ";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = getX();
        mouseY = getY();
        msg = "mouse pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("draggin mouse at " + mouseX + ", " + mouseY);
        repaint();
    }
    
    public void mouseDragged(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg="*";
        showStatus("draggin mouse at"+mouseX+", "+mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        showStatus("moving mouse at " + me.getX() + ", " + me.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
