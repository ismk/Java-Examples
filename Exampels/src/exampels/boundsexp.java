/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lab2
 */
public class boundsexp extends JFrame{

    public boundsexp() 
    {
        
        //JPanel on=new JPanel();
        setLayout(null);
        
        JLabel lbl1=new JLabel("hello111");
        JLabel lbl2=new JLabel("hello2222");
        lbl1.setBounds(20,10, 20,20);
       lbl2.setBounds(20,30, 20, 20);
        add(lbl1);
        add(lbl2);
     //setBackground(Color.red);
         
    }
    
    
    
    public static void main(String[] args) {
        boundsexp ob=new boundsexp();
       ob.setBackground(Color.yellow);
       ob.setSize(400,400);
        ob.setVisible(true);
    }
    
}
