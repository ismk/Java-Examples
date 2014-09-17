
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class JScrollBarExample extends JFrame implements AdjustmentListener {

    private static int width = 600;
    private static int height = (width / 16) * 9;
    JPanel jpnl;
    JScrollBar jsbR;
    JScrollBar jsbG;
    JScrollBar jsbB;
    Color R;
    
    JLabel Rtxt;
    JLabel Gtxt;
    JLabel Btxt;

    public JScrollBarExample() {
        jpnl = new JPanel();
        jpnl.setLayout(new FlowLayout());
        jsbR = new JScrollBar(JScrollBar.VERTICAL, 10, 0, 0, 255);
        jsbG = new JScrollBar(JScrollBar.VERTICAL, 20, 0, 0, 255);
        jsbB = new JScrollBar(JScrollBar.VERTICAL, 150, 0, 0, 255);
        
        Rtxt = new JLabel("R Value = "+jsbR.getValue());
        Gtxt = new JLabel("G Value = "+jsbG.getValue());
        Btxt = new JLabel("B Value = "+jsbB.getValue());
                
        
        jsbR.setPreferredSize(new Dimension(20, 200));
        jsbG.setPreferredSize(new Dimension(20, 200));
        jsbB.setPreferredSize(new Dimension(20, 200));
        
        
        jpnl.add(jsbR);
        jpnl.add(Rtxt);
        jpnl.add(jsbG);
        jpnl.add(Gtxt);
        jpnl.add(jsbB);
        jpnl.add(Btxt);
        
        jsbR.addAdjustmentListener(this);
        jsbG.addAdjustmentListener(this);
        jsbB.addAdjustmentListener(this);

        R = new Color(jsbR.getValue(), jsbG.getValue(), jsbB.getValue());
        jpnl.setBackground(R);

        add(jpnl);

        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollBarExample();
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        R = new Color(jsbR.getValue(), jsbG.getValue(), jsbB.getValue());
        jpnl.setBackground(R);
        Rtxt.setText("R Value = "+jsbR.getValue());
        Gtxt.setText("G Value = "+jsbG.getValue());
        Btxt.setText("B Value = "+jsbB.getValue());
        
        if (R.getRed() < 100 || R.getGreen() < 100 || R.getBlue() < 100){
            Rtxt.setForeground(R.WHITE);
            Gtxt.setForeground(R.WHITE);
            Btxt.setForeground(R.WHITE);
        }
        else{
            Rtxt.setForeground(R.BLACK);
            Gtxt.setForeground(R.BLACK);
            Btxt.setForeground(R.BLACK);
            
        }
        
    }

}
