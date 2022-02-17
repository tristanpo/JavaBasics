package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {
		int[][] numbers= {
				
				{10,20,30},//0
				
				{100,200,300,400},//1
				
				{1000,2000,}//2
				
		};

		//numbers.length -> gives # of rows
		int size=numbers.length;//when used with 2d array gives # of id arrays that we stored
		
		System.out.println(size);//3
		
		int sizeOf1Array=numbers[0].length;
		System.out.println("Size of first array="+sizeOf1Array);//4
		
		int sizeof2Array=numbers[1].length;
		System.out.println("Size of second array="+sizeof2Array);
		
		int sizeof3Array=numbers[2].length;
		System.out.println("Size of third array="+sizeof3Array);
		
		//Retrieving all elements from 2d array
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
