/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Lab3
 */
public class scrollpane1 extends JApplet
{
public void init()
{

setLayout(new BorderLayout());
JPanel jpanel = new JPanel();
jpanel.setLayout(new GridLayout(11, 16));
for(int outer = 0; outer <= 10; outer++) {
for(int inner = 0; inner <= 15; inner++) {
jpanel.add(new JTextField("Text Field " + outer +
", " + inner));
}
}
JScrollPane jscrollpane = new JScrollPane(jpanel,
ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
JLabel jlabel1 = new JLabel("Horizontal label");
JLabel jlabel2 = new JLabel("Vertical label");

jscrollpane.setColumnHeaderView(jlabel1);
jscrollpane.setRowHeaderView(jlabel2);
jscrollpane.setViewportBorder(BorderFactory.createEtchedBorder(10, Color.lightGray, Color.yellow));
add(jscrollpane);
}
}
