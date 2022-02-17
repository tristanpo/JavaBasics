package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		// Nested if - if inside another if
		/*
		 * if (boolean condition){ Code A; if (boolean condition){ Code B;
		 * 
		 * }
		 */
		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("how many doses you have");

			if (dose == 1) {
				System.out.println("you need another shot");
			} else {
				System.out.println("you are fully vaccinated");
			}
		} else {
			System.out.println("I do not have any further questions");
		}
		
		System.out.println("-------------------------------------------------");
		
		/*declare a variable for allergy
		 * if you have allergy----->
		 *If you have pollen
		 *if you have peanut
		 *if you have wheat 
		 *if no allergy--> you are lucky
		 */
		boolean allergy=false;
		
		if(allergy) {//outer if 
			System.out.println("Let's check what allergies you have");
			
			String allergyType="pollen";
			//nested if -> always has a dependency on outer if.
			//outer if MUST be true in order for nested if to be checked
			if(allergyType.equals("pollen")) {
				System.out.println("please stay at home when trees are blooming. Take med A");
			}else if (allergyType.equals("peanut")) {
				System.out.println("please do not eat food that contains nuts. Take med B");
			}else if (allergyType.equals("gluten")) {
				System.out.println("please follow gluten free diet. Take med C");
			}else {
				System.out.println("I don't which suggestion to give you");
			}
			
		}else {
			System.out.println("you are lucky");
		}
		
		
		
		
		
		
	}
}
