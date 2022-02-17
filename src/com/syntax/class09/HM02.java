package com.syntax.class09;

public class HM02 {

	public static void main(String[] args) {
		String[] animals= {"Dog","Cat","Mouse","Zebra","Wolf"};
		
		for (String species:animals) {
			System.out.println(species);
		}
		System.out.println("-------------------------------");
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]+" ");
		}
		

	}

}
