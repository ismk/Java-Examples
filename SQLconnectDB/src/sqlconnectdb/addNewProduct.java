package sqlconnectdb;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class addNewProduct extends JFrame {

    Connection con1;
    Statement stmt1;
    ResultSet rs1;

    JFrame jfrm;
    JPanel jpnl;

    JLabel lbldesc;
    JLabel lblqty;
    JLabel lblamt;

    JTextField txtdesc;
    JTextField txtqty;
    JTextField txtamt;

    JButton btnsub;
    JButton btnclose;

    SQLconnectDB scd = new SQLconnectDB();

    public void addingnew() throws SQLException {
        scd.connecting();
        jfrm = new JFrame();
        jpnl = new JPanel(null);
        jpnl.setBackground(Color.WHITE);

        lbldesc = new JLabel("Enter Description:");
        lbldesc.setBounds(10, 10, 100, 25);
        lblqty = new JLabel("Enter Quantity:");
        lblqty.setBounds(10, 50, 100, 25);
        lblamt = new JLabel("Enter Amount:");
        lblamt.setBounds(10, 90, 100, 25);

        txtdesc = new JTextField();
        txtdesc.setBounds(120, 10, 100, 40);
        txtqty = new JTextField();
        txtqty.setBounds(120, 50, 100, 40);
        txtamt = new JTextField();
        txtamt.setBounds(120, 90, 100, 40);

        btnsub = new JButton("Submit");
        btnsub.setBounds(50, 150, 100, 25);

        btnclose = new JButton("Close");
        btnclose.setBounds(150, 150, 100, 25);

        jpnl.add(lbldesc);
        jpnl.add(lblqty);
        jpnl.add(lblamt);
        jpnl.add(txtdesc);
        jpnl.add(txtqty);
        jpnl.add(txtamt);
        jpnl.add(btnsub);
        jpnl.add(btnclose);

        add(jpnl);
        System.out.println(scd.prod.proid);

        setSize(300, 300);
        setVisible(true);

        btnsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(addNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    con1 = DriverManager.getConnection("jdbc:odbc:Mart");
                    stmt1 = con1.createStatement();
                    rs1 = stmt1.executeQuery("select * from Mart");
                    stmt1.executeUpdate("insert into Mart values (" + (scd.prod.proid + 1) + "," + "'" + txtdesc.getText() + "'" + "," + txtqty.getText() + "," + txtamt.getText() + ")");
                    System.out.println("insert into Mart values (" + (scd.prod.proid + 1) + "," + "'" + txtdesc.getText() + "'" + "," + txtqty.getText() + "," + txtamt.getText() + ")");
                    txtdesc.setText("");
                    txtqty.setText("");
                    txtamt.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Inserted!");
//                    rs1.close();
//                    stmt1.close();
//                    con1.close();

                } catch (SQLException ex) {
                    Logger.getLogger(addNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        btnclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new tempFrame();
                dispose();
            }
        });
    }
}
