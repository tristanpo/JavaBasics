package com.syntax.class10;

public class Class09Recap {

	public static void main(String[] args) {
		/*Array- collection/group/container of values same data type
		 * values inside array called elements
		 * elements inside array stored based on indexes
		 * first index in Array starts from 0
		 * 
		 */
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=20;
		
		System.out.println(numbers[2]);//0
		System.out.println(numbers[3]);//indexOutOfBound
		
		//------------------------------------------------
		
		String[] weather= {"hot","cold","rainy","cloudy","snow"};
		
		System.out.println(weather[4]);
		
		int size=weather.length; //5
		
		//I need to loop:
		/*I know # of repetitions.                   I don't know # of repetitions.
		 *        for                                        while
		 * do i have array or collection                if I need to check condition first and then run while
		 * enhanced for loop
		 * 
		 *  I don't have an array or collection        if we need to run code at least once and then check do while
		 *  regular for loop                                            
		 */
		
		
	}

}
