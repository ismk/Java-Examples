
import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
        
        
public class NewClass extends Applet implements ActionListener
{
JLabel l1,l2;
JTextField txt1, txt2;
JPanel pan1;
JButton b1;
    public void init()
    {
        l1=new JLabel("enter rows");
        add(l1);
        txt1=new JTextField(10);
        add(txt1);
        
        
        l2=new JLabel("enter columns");
        add(l2);
        txt2=new JTextField(10);
        add(txt2);
        
        
        b1=new JButton("submit");
        add(b1);
        b1.addActionListener(this);
        pan1=new JPanel();
        add(pan1);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int rows=Integer.parseInt(txt1.getText());
        int columns=Integer.parseInt(txt2.getText());
        pan1.setLayout(new GridLayout(rows,columns));
        if(e.getSource()==b1)
        {
            for (int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    int count=(i*columns)+j;
                    if(count>=0)
                    {
                    pan1.add(new JButton("button"+count));
                    }
                }
                
            }
            
        }
        
    }
            
}



