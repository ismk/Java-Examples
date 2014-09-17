/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lab3
 */
public class filechooser extends JFrame implements ActionListener
{
JFileChooser chooser = new JFileChooser();
JButton jbutton = new JButton("Display file chooser");
JTextField jtextfield = new JTextField(30);
public filechooser()
{


setLayout(new FlowLayout());
add(jbutton);
add(jtextfield);
jbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int result = chooser.showOpenDialog(null);
File fileobj = chooser.getSelectedFile();
if(result == JFileChooser.APPROVE_OPTION) {
jtextfield.setText("You chose " + fileobj.getPath());
} else if(result == JFileChooser.CANCEL_OPTION) {
jtextfield.setText("You clicked Cancel");
}
}
public static void main(String args[])
{
JFrame f = new filechooser();
f.setBounds(200, 200, 400, 200);
f.setVisible(true);



}
}
