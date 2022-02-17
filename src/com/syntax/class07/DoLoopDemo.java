package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		System.out.println(" -------WHILE CHECK CONDITION BEFORE EXECUTION--------");
		int num=1;
		
		while (num<=5) {// is more used than do while
			System.out.println("hello");// 5 times 
			num++;
		}
		System.out.println(" ------DO WHILE CHECKS CONDITION AFTER EXECUTIOM-------- ");
		int num1=1;
		do {// is less used than while
			System.out.println("Hello");
			num1++;
		}while(num1<=3);
		
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int num3=1;
		
		do {
			System.out.println(num3+" ");
			num3++;;
		}while (num3<=30);
		}
	}

