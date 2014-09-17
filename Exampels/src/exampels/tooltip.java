/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lab3
 */
public class tooltip extends JApplet
{
JButton button = new JButton("Click Me");
JTextField text = new JTextField(20);
    JLabel lbl1=new JLabel("hello");
public void init()
{
setLayout(new FlowLayout());
button.setToolTipText("This is a button.");
add(button);
add(text);
lbl1.setToolTipText("This is hello label");
add(lbl1);
button.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent event) 
{
text.setText("Hello from Swing!");
}
}
);
}
}

