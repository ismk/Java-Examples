/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author lab3
 */
public class menu extends JFrame implements ActionListener{
JLabel lbl;
    public menu()
    {
        JMenuBar jmenubar = new JMenuBar();
JMenu jmenu1 = new JMenu("File");
JMenuItem jmenuitem1 = new JMenuItem("New..."),
jmenuitem2 = new JMenuItem("Open..."),
jmenuitem3 = new JMenuItem("Exit");
jmenu1.add(jmenuitem1);
jmenu1.add(jmenuitem2);
jmenu1.addSeparator();
jmenu1.add(jmenuitem3);
jmenuitem1.setActionCommand("You selected New");
jmenuitem2.setActionCommand("You selected Open");
jmenuitem1.addActionListener(this);
jmenuitem2.addActionListener(this);
JMenu jmenu2 = new JMenu("Edit");
JMenuItem jmenuitem4 = new JMenuItem("Cut"),
jmenuitem5 = new JMenuItem("Copy"),
jmenuitem6 = new JMenuItem("Paste");
jmenu2.add(jmenuitem4);
jmenu2.add(jmenuitem5);
jmenu2.add(jmenuitem6);
jmenuitem4.setActionCommand("You selected Cut");
jmenuitem5.setActionCommand("You selected Copy");
jmenuitem6.setActionCommand("You selected Paste");
jmenuitem4.addActionListener(this);
jmenuitem5.addActionListener(this);
jmenuitem6.addActionListener(this);
jmenubar.add(jmenu1);
jmenubar.add(jmenu2);
setJMenuBar(jmenubar);

         lbl=new JLabel();
        add(lbl);
setSize(400,400);
setVisible(true);

    }
    
    public static void main(String[] args) {
        new menu();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem jmenuitem = (JMenuItem)e.getSource();
        
        lbl.setText(jmenuitem.getActionCommand());


    }
    
}
