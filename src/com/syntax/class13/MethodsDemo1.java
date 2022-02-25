package com.syntax.class13;

public class MethodsDemo1 {
// void is type of methods that don't return anything when called
//checkEvenOdd is the name of the method
//()we use to pass information from outside
//int number this is parameter that we can use to pass this method when called
//we can use this variable inside the logic of method 
	void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	void ifName(String name) {
		if (name.equalsIgnoreCase("Teyfur")) {
			System.out.println("Memer");
		}else if(name.equalsIgnoreCase("Maha")){
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.ifName("Teyfur");
		object1.ifName("Maha");
		object1.ifName("Tristan");
		}
}
