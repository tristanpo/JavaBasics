package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		//next() vs nextLine();
		Scanner scan=new Scanner(System.in);
		System.out.println("Capturing values using next");
		String value=scan.next(); //nextInt(); nextDouble(); nextBoolean(); next();.charAt(0);
		System.out.println(value);
		System.out.println("Capturing values using nextLine");
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		System.out.println("End of the program");

	}

}
