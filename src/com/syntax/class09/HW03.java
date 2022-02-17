package com.syntax.class09;

public class HW03 {

	public static void main(String[] args) {
		int[] Num= {15,26,56,75,45};//My homework
		
		int sum=(Num[0]+Num[1]+Num[2]+Num[3]+Num[4]);
		
		System.out.println("The sum of all the numbers in the array = "+sum);

		
		//------------------------------------------
		
		int[] numbers= {15,45,10,32};//Asel's example 
		
		int size=numbers.length;
		int Sum=0;
		
		for (int i=0; i<size; i++) {
			Sum +=numbers[i];
		}
		
		System.out.println("Sum of all elements in the array = "+ Sum);
		//------------------------------------------
		Sum=0;
		
		for (int num:numbers) {//Asel's enhanced for loop example
			Sum+=num;
		}
		
		System.out.println("Sum of all elements in the array = "+ Sum);
	}
	

}
