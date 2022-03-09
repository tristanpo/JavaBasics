package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		String word="woohooo";
		if(!word.isEmpty()) {
			if (word.length()%2!=0&&word.length()>=3) {
				System.out.println(word.substring(3,4));
			}
		}
		
		System.out.println("-----------------------------");
		//asghars example
		String str="hello";
		
		if(str.length()%2!=0&&str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
		}
		
	}

}
