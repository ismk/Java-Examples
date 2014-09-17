/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exampels;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author lab3
 */
public class Jtabbedpane extends JApplet {

    public void init() {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavours", new FlavoursPanel());
        add(jtp);
    }
}

class CitiesPanel extends JPanel {

    public CitiesPanel() {
        JCheckBox b1 = new JCheckBox("new york");
        add(b1);

        JCheckBox b2 = new JCheckBox("japan");
        add(b2);

        JCheckBox b3 = new JCheckBox("india");
        add(b3);

        JCheckBox b4 = new JCheckBox("kandivli");
        add(b4);
    }
}

class ColorsPanel extends JPanel {

    public ColorsPanel() {
        JCheckBox cb1 = new JCheckBox("red");
        add(cb1);

        JCheckBox cb2 = new JCheckBox("blue");
        add(cb2);

        JCheckBox cb3 = new JCheckBox("yellow");
        add(cb3);

        JCheckBox cb4 = new JCheckBox("green");
        add(cb4);
    }
}

class FlavoursPanel extends JPanel {

    public FlavoursPanel() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Pista");
        jcb.addItem("Chocolet");
        jcb.addItem("Milk");
        jcb.addItem("Badam");
        add(jcb);
    }
}
