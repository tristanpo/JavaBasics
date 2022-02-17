package com.syntax.class06;

import java.util.Scanner;

public class Class06HW02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please provide a number");
		double num1=input.nextDouble();
		System.out.println("Please provide a second number");
		double num2=input.nextDouble();
		System.out.println("Please provide an arithmetical operator (+,-,*,/)");
		String op=input.next();
		
		double answer=0;
		
		if (op.equals("+")) {
			answer=num1+num2;
		}else if (op.equals("-")) {
			answer=num1-num2;
		}else if (op.equals("*")) {
			answer=num1*num2;
		}else if (op.equals("/")) {
			answer=num1/num2;
		}else {
			System.out.println("Invalid input");
		}
		System.out.println(num1+op+num2+"="+answer);
		
	}

}
