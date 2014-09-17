
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTabbedPaneExample extends JFrame {

    public JTabbedPaneExample() {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Languages", new Lang());
        jtp.addTab("Cities", new citiesPan());
        jtp.addTab("Countries", new countriesPan());
        jtp.addTab("Cars", new carsPan());


        add(jtp);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTabbedPaneExample();
    }

      class Lang extends JPanel {

        public Lang() {
            JComboBox jcb = new JComboBox();
            jcb.addItem("Java");
            jcb.addItem("Python");
            jcb.addItem("Ruby");
            jcb.addItem("PHP");
            jcb.addItem("JavaScript");
            jcb.addItem("C++");
            
            add(jcb);
        }
    }


    class carsPan extends JPanel {
        public carsPan() {
            JToggleButton tglbtn = new JToggleButton("Ferrari");
            JToggleButton tglbtn1 = new JToggleButton("Maserati");
            JToggleButton tglbtn2 = new JToggleButton("Lamborghini");
            JToggleButton tglbtn3 = new JToggleButton("Mercedes");
            JToggleButton tglbtn4 = new JToggleButton("BMW");

            add(tglbtn);
            add(tglbtn1);
            add(tglbtn2);
            add(tglbtn3);
            add(tglbtn4);
        }
    }
}

class countriesPan extends JPanel {
    public countriesPan() {
        JRadioButton rdiobtn = new JRadioButton("USA");
        JRadioButton rdiobtn1 = new JRadioButton("Germany");
        JRadioButton rdiobtn2 = new JRadioButton("France");
        JRadioButton rdiobtn3 = new JRadioButton("Sweden");
        JRadioButton rdiobtn4 = new JRadioButton("Norway");
        JRadioButton rdiobtn5 = new JRadioButton("India");

        add(rdiobtn);
        add(rdiobtn1);
        add(rdiobtn2);
        add(rdiobtn3);
        add(rdiobtn4);
        add(rdiobtn5);
    }
}

class citiesPan extends JPanel {
    public citiesPan() {
        JCheckBox chckbx1 = new JCheckBox("Delhi");
        JCheckBox chckbx2 = new JCheckBox("Mumbai");
        JCheckBox chckbx3 = new JCheckBox("Pune");
        JCheckBox chckbx4 = new JCheckBox("Surat");
        add(chckbx1);
        add(chckbx2);
        add(chckbx3);
        add(chckbx4);
    }

}
