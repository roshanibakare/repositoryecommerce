package com.product;

import java.sql.SQLException;

public class MainClass1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserDetails u=new UserDetails();
		u.getDetails();
		u.getproductDetail();
        ProductData1 p=new ProductData1();
        p.selectProduct();
        Admin a=new Admin();
        a.stoctCheck();
		
	}

}
