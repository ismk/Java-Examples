
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class JProgressBarExample extends JFrame {
    private int width = 500;
    private int height = width/16 *9;

    public JProgressBarExample() {
        
        JPanel jpl = new JPanel();
        jpl.setLayout(null);
        JProgressBar jpb = new JProgressBar();
        jpb.setBounds( 20, 20, 350, 25);
        
        JButton jbtn = new JButton("Increment Progress Bar");
        jbtn.setBounds(60, 50, 200, 25);
        jpl.add(jbtn);
        
        jpl.add(jpb);
        
        add(jpl);        
        
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    
    public static void main(String[] args) {
        new JProgressBarExample();
    }
    
}
