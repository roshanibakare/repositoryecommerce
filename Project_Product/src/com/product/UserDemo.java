package com.product;


public class UserDemo {
	
	   static int id;
	   String name;
	   String email;
	   int mobile;
	  
	  
	public UserDemo() {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public UserDemo(String name, String email, int mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		UserDemo.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserDemo [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
}
