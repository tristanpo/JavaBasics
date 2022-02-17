package com.syntax.class07;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		
		double coffee=1.99;
		Scanner input=new Scanner(System.in);
		double amount;
		do {
		System.out.println("Please pay for coffee");
		amount=input.nextDouble();
		if (amount>3) {
			System.out.println("Please give less");
		}else if (amount<3 && amount!=1.99){
			System.out.println("Please give more");
		}
		}while (amount!=coffee);
		
		System.out.println("Please enjoy your coffee");
		
	}

}
