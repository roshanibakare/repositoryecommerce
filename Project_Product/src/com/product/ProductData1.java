package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductData1 {
	
	
	     int pid;    
		public static void selectProduct() throws ClassNotFoundException, SQLException{    //  here fetch the product according to the product id
	
	      PreparedStatement ps=null;
	      Class.forName("com.mysql.cj.jdbc.Driver");                  // here we load class 
	      String url="jdbc:mysql://localhost:3306/product_db";            // here is url location of ur database
	      String username="root";
	      String password="maya";
	      Connection con = DriverManager.getConnection(url, username, password);
	      
	      String query="select * from product where prod_id=?";
		  PreparedStatement pst=con.prepareStatement(query);

		  Scanner sc = new Scanner(System.in);
		  System.out.println("-------------Select The Product Accroding To Product Id-------------");
		  System.out.println("Enter the product id");
		  int pid=sc.nextInt();
		 
		    pst.setInt(1, pid);
		    ResultSet rs=pst.executeQuery();
		    
		    
		    
		    
		    
		    while(rs.next()) {
		    	
		
				int p_id=rs.getInt(1);
				 System.out.println("Product no : "+p_id);
				 
				 String name=rs.getString(2);
				 System.out.println("name : "+name);
				 
				 System.out.println("description : "+rs.getString(3));
				 
				 int p=rs.getInt(4);
				 System.out.println("Price : "+p);
				 
				 int q=rs.getInt(5);
				 System.out.println("Quantity : "+q);
				 
				 
		
				String update_query="insert into cart values(?,?,?,?,?)";
				PreparedStatement pst4=con.prepareStatement(update_query);
				
				pst4.setInt(1, p_id);
				pst4.setString(2, name);;
				pst4.setInt(3,p);
				//pst4.setInt(4, q);
				
				System.out.println("Select the quantity of product");
				int f=sc.nextInt();
				
				if(f<q) {
				pst4.setInt(4, f);}else {
					
					throw new Custom1("Out of stock");
					
				}
			    int r=f*p;
			   
				pst4.setInt(5, r);
				pst4.execute();
				System.out.println("Product is added successfully in your cart");
				
				int s=q-f;
				String query1="insert into rem_qnty values(?,?)";
				PreparedStatement pst5=con.prepareStatement(query1);
				   
				pst5.setInt(1, p_id);
				pst5.setInt(2, s);
				pst5.execute();
				 getdata();
		    }
		   
          
}
	    public  static void getdata() throws ClassNotFoundException, SQLException {
	    	
	   
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to continue Shopping");
		System.out.println("y/n");
		String yes=sc.next();
		switch(yes) {
		case "yes":
			
			selectProduct();
			System.out.println();
			
			break;
		case "no":
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/product_db";            // here is url location of ur database
		    String username="root";
		    String password="maya";
			Connection con =DriverManager.getConnection(url,username,password);
			String query="select * from product_db.cart;";
			PreparedStatement pst=con.prepareStatement(query);
			
			ResultSet rs3=pst.executeQuery();
			while(rs3.next()) {
				System.out.println(rs3.getInt(1));
				System.out.println(rs3.getString(2));
				System.out.println(rs3.getInt(3));
				System.out.println(rs3.getInt(4));
				System.out.println(rs3.getInt(5));
				
				
				
			}
			
			System.out.println("Proceed to Payment");
			break;
			
		
		}
		
			
		
	
		
	}
	    
	    
		    
	


}
