/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Lab3
 */

    public class fill_slider extends JApplet implements ChangeListener
{
JSlider jslider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 0);
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
jslider.addChangeListener(this);
jslider.setValue(20);
contentPane.add(jslider);
}
public void stateChanged(ChangeEvent e)
{
JSlider jslider1 = (JSlider) e.getSource();
showStatus("Slider minimum: " + jslider1.getMinimum() +
", maximum: " + jslider1.getMaximum() +
", value: " + jslider1.getValue());
}
}
 


