/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frombigjava;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class RectangleApplet extends JApplet {
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5,10,20,30);
        g2.draw(box);
        box.translate(15, 25);
        g2.draw(box);
        
        
        

    }
    
}
