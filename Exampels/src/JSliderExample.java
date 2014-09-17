/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Lab3
 */
public class JSliderExample extends JPanel 
implements ChangeListener
{
    private JSlider mySlider;
    private JLabel lbSlideValue;
    
    
    public JSliderExample() 
   	{
        //construct components
        mySlider = new JSlider (0, 100);
        lbSlideValue = new JLabel("0");
        lbSlideValue.setFont(new Font("Arial",Font.BOLD,28));

        //set components properties
        mySlider.setOrientation (JSlider.HORIZONTAL);
        mySlider.setMinorTickSpacing (1);
        mySlider.setMajorTickSpacing (10);
       mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        mySlider.setValue(0);
        
        //adjust size and set layout
   
      setLayout (null);

        //add components
        add (mySlider);
        add (lbSlideValue);

        //set component bounds (only needed by Absolute Positioning)
        lbSlideValue.setBounds (415, 20, 100, 25);
        mySlider.setBounds (15, 10, 400, 65);
        
        
        mySlider.addChangeListener(this);
    }


	public void stateChanged(ChangeEvent e)
	{
		lbSlideValue.setText(String.valueOf(mySlider.getValue()));		
	}
    public static void main (String[] args) 
    {
        JFrame frame = new JFrame ("JSlider Example");
     
        frame.add (new JSliderExample());
    
        frame.setSize(500,250);
        frame.setVisible (true);
    }
}
