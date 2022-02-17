package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*create a secret number
		 * 
		 * we want user to guess our secret number
		 * 
		 * the moment user guessed my secret number --> my program should stop
		 * otherwise it should continue asking to guess my number 
		 * 
		 */
		
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		do {
			System.out.println("Please enter a number to win");
			 guessNumber=scan.nextInt();
		}while(guessNumber!=secretNumber);
System.out.println("Congratualtions");

	/*while and do loop used in java when we don't know in advance how many times we want to repeat from of code:
	 * example of lottery
	 * 
	 * for loop -- MOST WIDELY used loop in java
	 * I want to say hello- 5 times
	 * for (int i=1; i<=5; i++) {
	 * SOPLn("hello");
	 * }
	 */
	}

}
