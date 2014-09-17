package sqlconnectdb;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class delProduct extends JFrame {

    JFrame jfrm;
    JPanel jpnl;

    JLabel lblid;
    JLabel lbldesc;
    JLabel lblqty;
    JLabel lblamt;

    JTextField txtid;
    JTextField txtdesc;
    JTextField txtqty;
    JTextField txtamt;

    JButton btnget;
    JButton btndel;
    JButton btnclose;

    SQLconnectDB scd;

    void delexist() throws SQLException {
        scd = new SQLconnectDB();
        jfrm = new JFrame();
        jpnl = new JPanel(null);
        jpnl.setBackground(Color.WHITE);

        lblid = new JLabel("Enter ID of Product:");
        lblid.setBounds(10, 10, 100, 25);

        lbldesc = new JLabel("Description:");
        lbldesc.setBounds(10, 50, 100, 25);
        lblqty = new JLabel("Quantity:");
        lblqty.setBounds(10, 80, 100, 25);
        lblamt = new JLabel("Amount:");
        lblamt.setBounds(10, 110, 100, 25);

        txtid = new JTextField();
        txtid.setBounds(120, 10, 100, 30);

        txtdesc = new JTextField();
        txtdesc.setBounds(120, 50, 100, 30);
        txtqty = new JTextField();
        txtqty.setBounds(120, 80, 100, 30);
        txtamt = new JTextField();
        txtamt.setBounds(120, 110, 100, 30);

        txtdesc.setEditable(false);
        txtqty.setEditable(false);
        txtamt.setEditable(false);

        btnget = new JButton("Get");
        btnget.setBounds(0, 150, 75, 25);
        btndel = new JButton("Delete");
        btndel.setBounds(100, 150, 75, 25);
        btnclose = new JButton("Close");
        btnclose.setBounds(175, 150, 75, 25);

        jpnl.add(lblid);
        jpnl.add(lbldesc);
        jpnl.add(lblqty);
        jpnl.add(lblamt);
        jpnl.add(txtid);
        jpnl.add(txtdesc);
        jpnl.add(txtqty);
        jpnl.add(txtamt);
        jpnl.add(btnget);
        jpnl.add(btndel);
        jpnl.add(btnclose);

        add(jpnl);
        System.out.println(scd.prod.proid);

        setSize(300, 300);
        setVisible(true);

        btnget.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                txtdesc.setText("");
                txtqty.setText("");
                txtamt.setText("");
                for (int j = 0; j < scd.products.size(); j++) {
                    product tempprod = scd.getProduct(j);
                    if (tempprod.proid == Integer.valueOf(txtid.getText())) {
                        txtdesc.setText(tempprod.prodesc);
                        txtqty.setText(String.valueOf(tempprod.proqty));
                        txtamt.setText(String.valueOf(tempprod.proamt));

                    }
                }

            }
        });

        btndel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    scd.stmt.executeUpdate("delete from Mart where ID = " + txtid.getText());
                    txtdesc.setText("");
                    txtqty.setText("");
                    txtamt.setText("");

                } catch (SQLException ex) {
                    Logger.getLogger(addNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        btnclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

}
