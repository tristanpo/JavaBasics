package com.syntax.class04;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
//create a Scanner and assign to a variable
	//to import ctrl+shift+o	
		
		//1. create a Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
		//2.specify instructions
		System.out.println("Please enter country where you are from");
		
		//3 we need to capture String value --> use next();
		String country=scan.next();
		System.out.println("you are from "+country);
		
		//if you are from USA --> you speak english
		//	if you are from France --> you speak french
		
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("you speak english");
		}else if(country.equalsIgnoreCase("france")) {
			System.out.println("you speak french");
		} else if (country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak turkish");
		}else {
			System.out.println("I do not know which language you speak");
		}
	}

}
