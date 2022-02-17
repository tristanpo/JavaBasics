package com.syntax.class02;

public class Differences {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Bye";
		int c = 10;
		int d = 20;
		int sum=c+d;
		System.out.println(c + d + a + b);// 30HelloBye

		System.out.println(a + b + c + d);// HelloBye1020
		// Because it goes from right to left and cannot add bye to 10, you cannot add a
		// string to an int
		System.out.println(a+b+(c+d));//HelloBye30
		
		int num=123;
		String num2="123";
		System.out.println(num+num2);//123123
		String what=num+num2;
		System.out.println(what);//123123
		
	}

}
