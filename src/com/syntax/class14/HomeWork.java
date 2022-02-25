package com.syntax.class14;

public class HomeWork {
void Login(String username, String password,String confirmedPassword) {
	if (username.isEmpty()&&password.isEmpty()) {
		System.out.println("Username and Password cannot be empty");
	}else if (password.length()<8) {
		System.out.println("Password is too short");
	}else if (password.contains(username)) {
		System.out.println("Password cannot contain Username");
	}else if (password!=confirmedPassword) {
		System.out.println("Passwords do not match");
	}else {
		System.out.println("Your username and  password has been created");
	}
}
	public static void main(String[] args) {
		HomeWork obj=new HomeWork();
		obj.Login("trismis","abcdefgh","abcdefgh");
	
	}

}
