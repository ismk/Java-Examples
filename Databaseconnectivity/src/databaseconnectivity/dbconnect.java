/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import databaseconnectivity.product;

/**
 *
 * @author Lab2
 */
public class dbconnect {
    
    
    
	Connection con;
	Statement stmt;
	ResultSet rs;
	ArrayList<product> products=new ArrayList<product>();
	
	public int getRowCount()
	{
		return products.size();
	}
	
	public product getProduct(int pos)
	{
		product prod=(product)products.get(pos);
		return prod;
	}
	
		
	public dbconnect()
	{
		try
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:JavaLecture","sa","aptech");		
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from product");		
		
		while(rs.next())
		{
			product prod=new product();
                        prod.productid=rs.getInt("id");
			prod.productname=rs.getString("name");
			prod.productprice =rs.getString("price");
			
			products.add(prod);
		}
			
		}
		catch(Exception ex)
		{
			
		}
	}
	

}
