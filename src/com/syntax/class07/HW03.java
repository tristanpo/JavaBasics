package com.syntax.class07;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first name");
		String name=input.next();
		System.out.println("Please enter your last name");
		String lastName=input.next();
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		for (int i=0; i<=5; i++) {
			System.out.println("Your first name is "+name+" your lastname is "+lastName+" and your age is "+age);
			name=input.next();
		}
	}

}
