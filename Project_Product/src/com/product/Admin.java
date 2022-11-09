package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Admin extends UserDetails {

	public void stoctCheck() throws ClassNotFoundException, SQLException {
		
		Connection con= null;
		Class.forName("com.mysql.cj.jdbc.Driver");                  // here we load class 
	      String url="jdbc:mysql://localhost:3306/product_db";            // here is url location of ur database
	      String username="root";
	      String password="maya";
	      con = DriverManager.getConnection(url, username, password);
	      String query="insert into product_db.stock(?,?)";
		  PreparedStatement pst=con.prepareStatement(query);
		
		  pst.setInt(1, id);
		  pst.setInt(2, pid);
		  
		  pst.execute();

	}
	

}
