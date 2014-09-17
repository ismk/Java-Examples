/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frombigjava;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(5, 10, 20, 30);
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);   
        
        Color magenta = new Color(0,0,255);
        
        
        g2.draw(box);
        
        box.translate(15, 25);
        g2.draw(box);
        g2.setColor(magenta);
        g2.fill(box);
        g2.drawString("Hello World", 50, 100);
        
        
    }
    
}
