package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("What country are you from?");
		String con=input.next();
		String language;
		
		switch (con.toUpperCase()) {
		
		case "USA":
			language="English";
			break;
		case "GERMANY":
			language="German";
			break;
		case "FRANCE":
			language="French";
			break;
		case "RUSSIA":
			language="Russian";
			break;
		default:
			language="Unknown";
			break;
		}
		input.close();
			System.out.println("You speak "+language);
	}

}
