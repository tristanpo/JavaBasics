package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {

	public static void main(String[] args) {
		/*Create a secret number
		 * 
		 * we want user to guess our secret number
		 * 
		 * the moment user guessed dmy secret number ---> my program should stop
		 * otherwise it should continue asking to guess my number
		 */
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		System.out.println("please enter a number to win");
		guessNumber=scan.nextInt();
		
		while(guessNumber!=secretNumber) {
			System.out.println("please enter a number to win");
		}
System.out.println("Congratulations");
	}

}
