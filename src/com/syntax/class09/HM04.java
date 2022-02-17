package com.syntax.class09;

public class HM04 {

	public static void main(String[] args) {
		int[] numbers= {345,567,932,876,476};
		int biggestNum=numbers[0];
		for (int i=1; i<numbers.length; i++) {
		if (numbers[i]>biggestNum) {
			biggestNum=numbers[i];
		}
		}
		System.out.println("The largest number is "+biggestNum);
		
		System.out.println("----------------------------------------------");
		//Asel's example 
		//From an array find the largest number 
		int[] number = {15,45,10,32};
		
		int largest = number [0];
		
		for (int n=1; n<number.length; n++) {
			
			if (number[n]>largest) {
				largest = number[n];
			}
		}
		System.out.println(largest);
		//-------------------------------------------
		largest = number[0];
		
		for (int num:number) {
			
			if(num > largest ) {
				
				largest=num;
			}
		}
		System.out.println(largest);
	}

}

