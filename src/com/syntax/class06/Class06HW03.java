package com.syntax.class06;

import java.util.Scanner;

public class Class06HW03 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
			
	System.out.println("Please provide a number");
	double num1=input.nextDouble();
	System.out.println("Please provide a second number");
	double num2=input.nextDouble();
	System.out.println("Please provide an arithmetical operator (+,-,*,/)");
	String op=input.next();
	
	double answer=0;
	
	switch (op) {
	
	case "+":
		answer=num1+num2;
		break;
	case "-":
		answer=num1-num2;
		break;
	case "*":
		answer=num1*num2;
		break;
	case "/":
		answer=num1/num2;
		break;
	default:
		System.out.println("Invalid input");
		break;
	}	
	System.out.println(num1+op+num2+"="+answer);	
		
	
	
	}

}
