package com.syntax.class14;

public class StrinDemo1 {

	public static void main(String[] args) {
		String name="Shahima";//Always use this one its shorter
		String name2=new String("Shahima");
		
		System.out.println(name);
		System.out.println(name2);
		
		System.out.println(name.length());
		String newName=name2.toLowerCase();
		System.out.println(name2.toLowerCase());
		System.out.println(name2.toUpperCase());
		
		System.out.println(name+name2);// you should always prefer this method to perform concatination
		System.out.println(name.concat(name2));
		name="              ";
		System.out.println(name.isEmpty());
		// System.out.println(name.isBlank());
	}

}
