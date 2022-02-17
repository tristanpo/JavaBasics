package com.syntax.class10;

public class AllFrom2DArray {
public static void main(String[] args) {
	String [][] food= {
			
			{"Redbull","Burger","Steak","Fries"},
			{"Curry","Biriyani","butter Chicken"},
			{"noodles","pad thai","tom yum"},
			{"Pizza","Pasta"}
			
			
	};
	//iterates over every array/row
	for (int row=0; row<food.length;row++) {
		
		//iterate over every column of specified row
		
		for(int col=0; col<food[row].length; col++ ) {
			//accesing elements
			System.out.println(food[row][col]);
		}
	}
}
}
