package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		String name="Aizhan";
		
		String lastName="Abenova";
		
		long phoneNumber= 9234567890l;
		
		String mobileNumber="123-456-7890";
		
		String numb="123";
		int num1=123;
		
		String greeting="hello friends!";
		
		System.out.println(greeting);
		//syso+ctrl+space---> autocomplete print statement 
		System.out.println(lastName);
		System.out.println(name);
		
		System.out.println(name+" "+lastName);
		
		/* using + we can concatenate
		 * string +string
		 * string + int
		 * string+ boolean
		 * string + double, char etc...-
		 */
		int age=25;
				
		// Aizhan is 25 years old
		System.out.println(name+" is "+age+" years old");
		
		// I live on 123 Test Street
		String address="123 Test Street";
		System.out.println("I live on "+address);
		
		String food="kebab";
		String feeling="like";
		System.out.println("I "+feeling+" "+food);
		
		feeling="love";
		food="shrimp";
		
		System.out.println("I "+feeling+" "+food);
	}

}
