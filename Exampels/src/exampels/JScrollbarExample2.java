/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.applet.Applet;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Lab3
 */
public class JScrollbarExample2 extends JFrame
implements AdjustmentListener
{
	JScrollBar jsb1,jsb2,jsb3;
	JPanel p;
	
	public JScrollbarExample2() 
    {
        
		jsb1=new JScrollBar(JScrollBar.VERTICAL,0,0,0,256);
		jsb2=new JScrollBar(JScrollBar.VERTICAL,0,0,0,256);
		jsb3=new JScrollBar(JScrollBar.VERTICAL,0,0,0,256);
		
		p=new JPanel();
		
		jsb1.addAdjustmentListener(this);
		jsb2.addAdjustmentListener(this);
jsb3.addAdjustmentListener(this);		
			
		jsb1.setBounds(10,30,25,200);
		jsb2.setBounds(40,30,25,200);
		jsb3.setBounds(70,30,25,200);
                jsb1.setValue(10);
		
		p.setLayout(null);
		p.add(jsb1);
		p.add(jsb2);
		p.add(jsb3);
		
		add(p);
		
		
		setSize(200,300);
                setVisible(true);
		p.setBackground(Color.RED);
    }
    
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
    	Color col=new Color(jsb1.getValue(),jsb2.getValue(),jsb3.getValue());
    	//Color col=new Color(255,255,255);
    	p.setBackground(col);
       
    }
    public static void main(String[] args) {
        new JScrollbarExample2();
    }
   
}
