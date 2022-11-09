package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserDetails extends ProductData1{
	
	
	int id;
	public static void getDetails() {
		Connection connection=null;
		PreparedStatement pst=null;
		try {   // here we handle the exception which is the checked exception
			
			Class.forName("com.mysql.cj.jdbc.Driver");                  // here we load class 
			String url="jdbc:mysql://localhost:3306/product_db";            // here is url location of ur database
			String username="root";
			String password="maya";
			connection=DriverManager.getConnection(url, username, password);
			String query="Insert into user values(?,?,?,?)";   //here using insert query for inserting data into table
			
			pst=connection.prepareStatement(query);
			//do {
			System.out.println("---------------------WECOME-TO-OUR-STORE-----------------");
			System.out.println("Register Here : ");
			Scanner sc = new Scanner(System.in);                  //here we user scanner for giving user input
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			//int id=sc.nextInt();
			System.out.println("Enter name : ");
			String name =sc.next();
			System.out.println("Enter email : ");
			String email = sc.next();
			System.out.println("Enter mobile : ");
			int mobile = sc.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setInt(4, mobile);
			
			int i=pst.executeUpdate();
			System.out.println(i+"Insertion Successfully.........");
			System.out.println("---------------Products------------------");
			
			
			} 
			catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}	
		
	}
	
	    public static void getproductDetail() throws SQLException {     // here we throws exception
	    	
	    	Connection con=null;
	    	
				
	    	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			String url="jdbc:mysql://localhost:3306/product_db";
			String username="root";
			String password="maya";
			con=DriverManager.getConnection(url, username, password);
			String query="select * from product_db.product";   
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			
				System.out.println(rs.getString(2));
	
				System.out.println(rs.getString(3));
		
				System.out.println(rs.getString(4));
				
				System.out.println(rs.getString(5));
				
			}
			
			
			s.close();
			con.close();
				
	    }
	    
	
	
	
	
	
	
}
