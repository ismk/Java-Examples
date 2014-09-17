/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author lab3
 */
public class toolbr extends JApplet implements ActionListener
{
JButton jbutton1 = new JButton("Button 1", new ImageIcon("bulg2.jpg"));
JButton jbutton2 = new JButton("Button 2", new ImageIcon("bulg2.jpg"));
JButton setrollbutton = new JButton("Set Rollover");
JToolBar jtoolbar = new JToolBar();
JToolBar setrollover = new JToolBar();
public void init()
{
Container contentPane = getContentPane();
jbutton1.addActionListener(this);
jbutton2.addActionListener(this);
setrollbutton.addActionListener(this);
jtoolbar.add(jbutton1);
jtoolbar.addSeparator();
jtoolbar.add(jbutton2);
setrollover.add(setrollbutton);
contentPane.add(jtoolbar, BorderLayout.NORTH);
contentPane.add(setrollover, BorderLayout.SOUTH);
jtoolbar.setFloatable(false);
jtoolbar.setRollover(false);

}
public void actionPerformed(ActionEvent e)
{
if(jtoolbar.isRollover()){
if(e.getSource() == jbutton1) {
showStatus("You clicked button 1");
} else if (e.getSource() == jbutton2) {
showStatus("You clicked button 2");
}
}
else
{
showStatus("Rollover is not set! SET THE ROLLOVER FIRST");
}
if(e.getSource() == setrollbutton) {
jtoolbar.setRollover(true);
showStatus("Setting Rollover Successful");
}
}
}

