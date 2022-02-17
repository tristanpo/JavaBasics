package com.syntax.class05;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("using next");
		
		String value=scan.next();
		System.out.println(value);
		
		scan.nextLine(); //will resolve skipping
		
		System.out.println("Using nextLine");//nextInt(); nextDouble(); nextBoolean(); next();.charAt(0);
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("end of the program");
	}

}
