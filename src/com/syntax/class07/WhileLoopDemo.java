package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=5) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("The value of i outside of while loop = "+i);
		//I need to print values from 2 to 20
		
		int a=2;
		while (a<=20) {
			a++;
		}	
		
		//I need to print values from 1 to 50 all in 1 line
		
		int b=1;
		
		while (b<=50) {
			
			System.out.print(b+" ");
			b++;
		}
		
		System.out.println(" -- I NEED NUMBER FROM 20 TO 1--");
		
		int c=20;
		
		while (c>=1)
			System.out.print(c+" ");
		c--;
		
		
		System.out.println("the end");
		
		//TASK
		System.out.println("PRINT ONLY EVEN NUMBERS FROM 1 TO 30");
		
		int g=1;
		while (g<=30)
			g++;
		
	}
	

}
