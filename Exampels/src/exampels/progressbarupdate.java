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
import javax.swing.JProgressBar;

/**
 *
 * @author lab3
 */
public class progressbarupdate extends JApplet {

    JProgressBar jprogressbar = new JProgressBar();
    JButton jbutton = new JButton("Increment the progress bar");

    public void init() {
        setLayout(new FlowLayout());
        add(jprogressbar);
        add(jbutton);
        jprogressbar.setStringPainted(true);
        jprogressbar.setValue(20);
        jbutton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jprogressbar.setValue(jprogressbar.getValue() + 5);
                    }
                }
        );
    }
}
