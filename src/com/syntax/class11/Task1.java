package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of Int values using a scanner and calculate 
		 * the sum of all stored elements in that array
		 */
		//Take the size of the Array using scanner class from the user
		//creat an int array of above size
		// fill the array with elements from the user using scanner class
		//sum all the elements of the array
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=scanner.nextInt();
		System.out.println("Size of the array "+size);
		int[] array=new int[size];
		System.out.println("Please enter "+size+" element");
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
		}
		//print out the lements of an array without loops
		System.out.println(Arrays.toString(array));
		//4) sum all the elements of the array
		int sum=0;
		
		for (int x=0; x<size; x++) {
			sum=sum+array[x];
		}
		System.out.println("Sum of array elemtns is "+ sum);
		
		
	}

}
