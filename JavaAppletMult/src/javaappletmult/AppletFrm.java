package javaappletmult;

import java.applet.Applet;
import java.awt.*;

public class AppletFrm extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.drawString("Hello from Java", 60, 100);

    }

}
