package com.syntax.class14;

public class Task3 {
	String sayHello(String country) {
		country=country.toLowerCase();
		switch(country) {
		case "usa":
			return "wa sup";
		case "france":
			return "Bonjour";
		case "turkey":
			return "Merhaba";
		default:
			return "Zulfiya is very good and patience student who loves Silva";
		}
	}
	public static void main(String[] args) {
		/*
		 * create a method that will say Hello in different language based on the country that will passed when 
		 * method is executed
		 */
		Task3 object=new Task3();
		String country=object.sayHello("USA");
		System.out.println(country);
	}

}
