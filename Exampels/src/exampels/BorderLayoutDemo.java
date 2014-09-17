/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import java.awt.*;
import java.applet.*;
import java.util.*;
public class BorderLayoutDemo extends Applet {
    Button btn;
public void init() {
    btn=new Button("This is across the top");
setLayout(new BorderLayout());
add(btn,BorderLayout.NORTH);
add(new Label("The footer message might go here."),BorderLayout.SOUTH);
add(new Button("Right"), BorderLayout.EAST);
add(new Button("Left"), BorderLayout.WEST);
String msg = "The reasonable man adapts " +
"himself to the world;\n" +
"the unreasonable one persists in " +
"trying to adapt the world to himself.\n" +
"Therefore all progress depends " +
"on the unreasonable man.\n\n" +
" - George Bernard Shaw\n\n";
add(new TextArea(msg), BorderLayout.CENTER);
}

}