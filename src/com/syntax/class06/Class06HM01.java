package com.syntax.class06;

public class Class06HM01 {

	public static void main(String[] args) {
		char grade='A';
		String answer;
		switch (grade) {
		
		case 'A':
			answer = "Excellent";
			break;
		case 'B':
			answer = "Good";
			break;
		case 'C':
			answer = "Average";
			break;
		case 'D':
			answer = "Bad";
		default:
			answer = "Not acceptable";
			break;
			
		}
		System.out.println("You have an "+grade+" which is "+answer);

	}

}
