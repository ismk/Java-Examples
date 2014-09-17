/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtreeexample;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Administrator
 */
public class JTreeExample extends JFrame {

    JTree tree;
    JTextField txtf;

    public JTreeExample() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("TOP");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a1);
        a.add(a2);
        DefaultMutableTreeNode aa2 = new DefaultMutableTreeNode("AA2");
        a1.add(aa2);
        DefaultMutableTreeNode aa1 = new DefaultMutableTreeNode("AA1");
        a2.add(aa1);
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("AA1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
        top.add(c);
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("C1");
        c.add(c1);
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("C2");
        c.add(c2);
        
        tree = new JTree(top);
        
        
        JScrollPane jsp = new JScrollPane(tree,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp,BorderLayout.CENTER);
        
        txtf = new JTextField(" ",20);
        add(txtf, BorderLayout.SOUTH);
        
        
        setVisible(true);
        setSize(300, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        int number = Integer.valueOf(JOptionPane.showInputDialog("Enter a number"));
        JOptionPane.showMessageDialog(null, number);
        new JTreeExample();
    }

}
