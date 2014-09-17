
import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tableusinglayout extends Applet implements ActionListener
{
    JLabel l1;
    JTextField txt1;
    JButton b1;
    JPanel pan1;
    public void init()
    {
        pan1=new JPanel();
        add(pan1);
        
        l1=new JLabel("enter no");
        add(l1);
        
        txt1=new JTextField(10);
        add(txt1);
        
        b1=new JButton("submit");
        add(b1);
        b1.addActionListener(this);
        
        JLabel[][] l2=new JLabel[10][5];
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num=Integer.parseInt(txt1.getText());
        
        for (int i=1;i<=10;i++)
        {
            pan1.setLayout(new GridLayout(10,5));
            
        }
    }
    
    
}
