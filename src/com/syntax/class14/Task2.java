package com.syntax.class14;

public class Task2 {
	//create a method that will take two parameter as numbers and prints which number is larger
	void printLarger (int num1, int num2) {
		
		if (num1>num2) {
			System.out.println("number 1 is greater");
		}else if (num2>num1) {
			System.out.println("number 2 is greater");
		}else {
			System.out.println("Numbers are the same");
		}
	
	}

	public static void main(String[] args) {
		Task2 object=new Task2();
		object.printLarger(10,12);
		

	}

}
