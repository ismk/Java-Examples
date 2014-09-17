/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lab2
 */
public class Exp1 extends JFrame
{
    public Exp1()
    {
        JPanel pn=new JPanel();
    JLabel lbl1=new JLabel("Hello1");
    JLabel lbl2=new JLabel("Hello1222");
    pn.setLayout(null);
    lbl1.setBounds(10, 20, 20, 20);
    lbl2.setBounds(10, 40, 20, 20);
    pn.add(lbl1);
    pn.add(lbl2);
    add(pn);
    setSize(400,400);
    setVisible(true);
            }
    
    public static void main(String[] args) {
        new Exp1();
    }
    
}
