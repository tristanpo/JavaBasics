package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		//I want to create an array of colors;
		
		String[] colors= {"blue","pink","yellow","orange"};
		
		System.out.println("My favorite color is "+colors[2]);
		
		//possible to do declaration and initialization in 2 step
		String[] array;//1. declaring
		array=new String[4];//2. initializing size
		//NOT possible to do declaration and initialization in 2 step
		/*
		String[] arr;
		arr= {};
		*/
	}

}
