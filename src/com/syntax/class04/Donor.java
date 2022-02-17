package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
	int age=20;
	
	if (age>=18) {
		System.out.println("you are of age");
		int weight=105;
		if (weight>=110) {
			System.out.println("you are acceptable");
		}else {
			System.out.println("you are not acceptable");
		}
	}else {
		System.out.println("you are not eligible");
	}
		
		
		
		
		/* Else block cannot exist by itself
		 * else {
		 * System.out.println("condition us false")
		 * }
		 */
		
		
	}
	}