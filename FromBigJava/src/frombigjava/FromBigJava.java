package frombigjava;

import javax.swing.*;
import java.net.*;

public class FromBigJava {

    public static void main(String[] args) throws MalformedURLException {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectangleComponent comp = new RectangleComponent();
        frame.add(comp);
        frame.setVisible(true);
        
        

    }

}
