
package pkg20140215.gui.areacalc;

import java.awt.CardLayout;
import java.awt.Frame;
import javax.swing.*;

public class AreaCalc  extends Frame{
    JButton tbtn,circbtn,calcArea;
    JLabel dLen,dWidth,dRad,dArea;
    JTextField inpLen,inpWidth,inpRad;
    CardLayout cardLo;
    JPanel main,triPan,circPan;    
    
    public static void main(String[] args) {
        new AreaCalc();
    }
    AreaCalc(){
        
        setTitle("Area Calculation Example");
        main = new JPanel(new CardLayout());
        add(main);
        triPan = new JPanel();
        circPan = new JPanel();
        main.add(triPan, "Triangle");
        tbtn = new JButton("Triangle");
        main.add(tbtn);
        main.add(circPan, "Circle");
        
        
        
        
        
        setSize(250, 250);
        setVisible(true);
        

}
    
}

