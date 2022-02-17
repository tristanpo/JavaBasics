package com.syntax.class10;

public class AdvancedArray {

	public static void main(String[] args) {
		String [][] food= {
				
				{"Redbull","Burger","Steak","Fries"},
				{"Curry","Biriyani","butter Chicken"},
				{"noodles","pad thai","tom yum"},
				{"Pizza","Pasta"}
				
				
		};
		
		System.out.println("     ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP    ");
		
		//outer loops over each array inside 2D array
		for(String[] cousine :food) {
			
			//inner loop over each element from selected array
			for(String f:cousine) {
				
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
