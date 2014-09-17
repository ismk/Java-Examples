package jtableexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JTableExample extends JFrame implements ActionListener{
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    JTextField txtf;
    JTable jtbl;
    JPanel jpnl;
    JButton search;
    JScrollPane jsp;

    public JTableExample() {
        try {
            int cols = 4;
            
            String columnNames[] = {"ID", "Description", "Quantity", "Amount"};
            
            jtbl = new JTable();
            jpnl = new JPanel();
            jpnl.setLayout(null);
            DefaultTableModel dtnlmdl = (DefaultTableModel) jtbl.getModel();
            dtnlmdl.setColumnIdentifiers(columnNames);
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:Mart");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from Mart");
            
            while (rs.next()) {
                
                Object[] obj = new Object[cols];
                for (int i=0;i<cols;i++){
                    obj[i] = rs.getString(i+1);
                }
                dtnlmdl.addRow(obj);
            }
            
            jpnl.add(jtbl);
            
            txtf = new JTextField();
            jpnl.add(txtf);
            txtf.setBounds(0, 180, 200, 20);
            
            search = new JButton("Search ID!");
            jpnl.add(search);
            search.setBounds(0, 200, 200, 20);
            search.addActionListener(this);
            
            
            jsp = new JScrollPane(jtbl);
            jsp.setBounds(0, 0, 500, 300);
            jpnl.add(jsp);
            
            add(jpnl);
            
            setSize(800, 600);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(JTableExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JTableExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new JTableExample();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String srchStr = txtf.getText();
        
    }

}
