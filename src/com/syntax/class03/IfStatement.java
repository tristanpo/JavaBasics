package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * Scenario: I need to compare 2 numbers and I have to find which is bigger
		 */
		int num1=100;
		int num2=50;
		//Result of relational and equality operators ALWAYS boolean value (true, false)
		/*if statement
		 * SYNTAX OF IF STATEMENT 
		 * if (boolean condition){
		 * code;
		 * }
		 */
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		double money=5;
		double coffee=5;
		// if I have more money than a price of the coffee--> I am buying coffee
		
		if (money>=coffee) {
			System.out.println("I am buying the coffee");
		}
		
		//if(money=coffee) { Error because if condition alwasy must be boolean
		// we use double--> because of the wrong operator
	//}
		
		/*else{
		 * code;
		 * }
		 */
		
	}

}
