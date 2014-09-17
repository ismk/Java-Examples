
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPicker extends JFrame implements ActionListener {
JPanel pn;
    public ColorPicker() {
        setLayout(null);
        pn = new JPanel();
        pn.setBounds(0, 0, 300, 300);
        pn.setLayout(null);

        JButton clrbtn = new JButton("Choose a Color");
        clrbtn.setBounds(75,75, 125, 50);
        clrbtn.addActionListener(this);
        pn.add(clrbtn);
        add(pn);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ColorPicker();
    }

    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(ColorPicker.this, "Select a new color...", Color.RED);
        pn.setBackground(color);

    }

}
