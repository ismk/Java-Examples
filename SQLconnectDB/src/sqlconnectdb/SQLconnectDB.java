package sqlconnectdb;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SQLconnectDB {

    Connection con;
    Statement stmt;
    ResultSet rs;

    ArrayList<product> products = new ArrayList<product>();
    product prod;

    public int getRowCount() {
        System.out.println(products.size());
        return products.size();
    }

    public product getProduct(int pos) {
        product prod = (product) products.get(pos);
        return prod;
    }

    public  void connecting() throws SQLException {
        JOptionPane.showMessageDialog(null, "inside connecting");
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:Mart");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from Mart");
            
            while (rs.next()) {

                prod = new product();
                prod.proid = rs.getInt(1);
                prod.prodesc = rs.getString(2);
                prod.proqty = rs.getInt(3);
                prod.proamt = rs.getInt(4);

                products.add(prod);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLconnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        rs.close();
        stmt.close();
        con.close();
    }

}
