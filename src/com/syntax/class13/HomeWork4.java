package com.syntax.class13;

public class HomeWork4 {
	
	String createEmail(String Fname,String Lname, String email) {
		return ("Email is "+Fname+Lname+"@"+email+".com");
	}
	public static void main(String[] args) {
		HomeWork4 obj=new HomeWork4();
		System.out.println(obj.createEmail("Tristan", "Poseley", "gmail"));
				
	}

}
