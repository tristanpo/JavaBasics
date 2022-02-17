package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What day is it?");
		String day=input.next();
		if (day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("friday")) {
			System.out.println("There is no class");
		}else if (day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")) {
			System.out.println("Manual");
		}else if (day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")) {
			System.out.println("Java class");
		}else if (day.equalsIgnoreCase("thursday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Invalid");
		}
		

	}

}
