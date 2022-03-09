package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		String day="Sunday";
		String reverse="";
		for (int i=day.length()-1; i>=0; i--) {
			reverse=reverse+day.charAt(i);
		}
		System.out.println(reverse);
		
		System.out.println("-----------------------------");
		//Asghars example
		String str="Sunday";
		String reversedStr="";
		for (int i=str.length()-1;i>=0;i--) {
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println(reversedStr);
	}

}
