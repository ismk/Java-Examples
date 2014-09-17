package pkg20140215.gui.areacalc;

import java.applet.Applet;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIAreaCalc extends Frame implements MouseListener {

    JButton Triangle, Circle, calcArea;
    JLabel entLen, entWdth, entRad, displayArea;
    JTextField tLen, tWidth, cRad;
    JPanel main;
    CardLayout cardLO;

    public static void main(String[] args) {
        new GUIAreaCalc();
    }

    GUIAreaCalc() {
        setTitle("Card Layout Example");
        setLayout(new FlowLayout());
        Triangle = new JButton("Triangle");
        Circle = new JButton("Circle");
        add(Triangle);
        add(Circle);
        cardLO = new CardLayout();
        main = new JPanel();

        main.setLayout(cardLO);

        entLen = new JLabel("Enter Length: ");
        entWdth = new JLabel("Enter Width: ");
        entRad = new JLabel("Enter Radius: ");
        displayArea = new JLabel("Area = ");
        tLen = new JTextField();
        tWidth = new JTextField();
        cRad = new JTextField();

        JPanel triP = new JPanel(new GridLayout(2, 2));
        triP.add(entLen);
        triP.add(entWdth);
        triP.add(tLen);
        triP.add(tWidth);
        triP.add(displayArea);

        JPanel cirP = new JPanel(new GridLayout(2, 2));
        cirP.add(entRad);
        cirP.add(cRad);
        cirP.add(displayArea);

        main.add(triP, "Calculate Triangle");
        main.add(cirP, "Calculate Circle");

        add(main);
        addMouseListener(this);

        setSize(250, 250);
        setVisible(true);
        
     
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
