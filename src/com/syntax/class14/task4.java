package com.syntax.class14;

public class task4 {
	String createEmail(String userName,String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}
	public static void main(String[] args) {
		/*
		 * create a method creatEmail(). based on values of users name,
		 * lastName and email type, your method shou;d return complete email
		 * address. Example: createEmail(john,snow,gmail) johnsnow@gmail.com 
		 */
		task4 obj=new task4();
		System.out.println(obj.createEmail("Zul","Fiya","gmail"));
	}

}
