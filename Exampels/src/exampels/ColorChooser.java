/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author lab3
 */
public class ColorChooser extends JFrame implements ActionListener
{
    JPanel jpanel;
    public ColorChooser()
    {
    
jpanel = new JPanel();
JButton jbutton;

jbutton = new JButton("Click here to change colors.");
jbutton.addActionListener(this);
jpanel.add(jbutton);
add(jpanel);
setSize(400,400);
setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
Color color = JColorChooser.showDialog(ColorChooser.this,"Select a new color...", Color.RED);
jpanel.setBackground(color);
}

    public static void main(String[] args) {
        new ColorChooser();
    }

}



