package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		String userName="Lilly";
		String passWord="Lilly123";
		
		if ("Lilly".equals(userName)&&"Lilly123".equals(passWord)) {
			System.out.println("Welcome back");
		}else {
			System.out.println("UserName or password is not correct");
		}

	}

}
