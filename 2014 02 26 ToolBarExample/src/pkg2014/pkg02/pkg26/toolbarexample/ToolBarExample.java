package pkg2014.pkg02.pkg26.toolbarexample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.*;

public class ToolBarExample extends JApplet implements ActionListener {

    JButton jbtn1 = new JButton("Button 1");
    JButton jbtn2 = new JButton("Button 2");
    JButton setrollbtn = new JButton("Set Rollover");
    JToolBar jtoolbar = new JToolBar();
    JToolBar setrollover = new JToolBar();

    public void init() {
        jbtn1.addActionListener(this);
        jbtn2.addActionListener(this);
        setrollbtn.addActionListener(this);
        jtoolbar.add(jbtn1);
        jtoolbar.addSeparator();
        jtoolbar.add(jbtn2);
        setrollover.add(setrollbtn);
        add(jtoolbar, BorderLayout.NORTH);
        add(setrollover, BorderLayout.SOUTH);
        jtoolbar.setFloatable(false);
        jtoolbar.setRollover(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (jtoolbar.isRollover()) {
            if (e.getSource() == jbtn1) {
                showStatus("You Clicked Button 1");
            } else if (e.getSource() == jbtn2) {
                showStatus("You Clicked Button 2");
            }
        }
        else{
            showStatus("RollOver not Set");
        }
        if (e.getSource() == setrollbtn){
            jtoolbar.setRollover(true);
            showStatus("Setting Rollover Successful");
        }
    }

}
