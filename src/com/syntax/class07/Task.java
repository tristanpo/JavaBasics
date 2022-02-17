package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		//TASK
		System.out.println("PRINT ONLY EVEN NUMBERS FROM 1 TO 30");
		
		int g=2;
		while (g<=30) {
			System.out.print(g+" ");
			g+=2;
		}
		System.out.println("another way to print even number from 1 to 30");
		
		int e=1;
		
		while (e<=30) {
			
			if (e % 2 == 0) {
				System.out.print(e+" ");
			}
			e++;
		}
	}

}
