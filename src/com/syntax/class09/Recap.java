package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		/*
		 * nested loops
		 * break - breaks the loop
		 * continue- skips the current iteration
		 * 
		 * for (int i=1; i<=4; i++){
		 * code A;
		 * 
		 * break;
		 * 
		 * code B;
		 * }
		 * 
		 */
		
		for (int i=1; i<=4; i++) {
			System.out.println("A");
			//break;
			System.out.println("B");
		}
		
		System.out.println("-----------------------------");
		
		for (int i=1; i<=3; i++) {// outer loop controls number of complete iteration of inner loop
			
			for (int j=1; j<=3; j++) {// inner loops always depends on outer
				
				System.out.println("Hello");
				//break;
			}
			
			System.out.println("Good Morning");
		}
/* for (int i=0; i<=3; i++){
 * System.out.println("Hello");
 * 
 * continue;
 * 
 * for (int j=1; j<=4; j++){
 * System.out.println(Good Morning");
 * }
 * }
 * 
 */
		//continue can only go back into the line it was initialized in 
		//Better to put continue in an If statement
	}

}
