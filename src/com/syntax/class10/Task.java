package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order
		
		int[] num= {10,75,50,25};
		
		for (int n=3; n>=0; n--) {
			System.out.println(num[n]);
		}
		System.out.println("----------------------");
		//Asel's example
		
		int[] arr= {10,20,30,40,50,60};
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------");
		for (int i=arr.length-1;i>=0; i--) {
			
			System.out.println(arr[5]);
		}
	}

}
