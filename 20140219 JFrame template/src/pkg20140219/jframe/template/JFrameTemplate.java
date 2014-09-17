/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg20140219.jframe.template;

import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class JFrameTemplate extends JFrame{
    
    public JFrameTemplate() {
        JPanel pn = new JPanel();
        JLabel lbl1 = new JLabel("label 1");
        JLabel lbl2 = new JLabel("label 2");
        lbl1.setBounds(0, 0, 50, 10);
        lbl2.setBounds(0, 10, 50, 10);
        
        pn.setLayout(null);
        
        pn.add(lbl1);
        pn.add(lbl2);
        add(pn);
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    

    public static void main(String[] args) {
        new JFrameTemplate();
    }
    
}
