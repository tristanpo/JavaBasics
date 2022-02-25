package com.syntax.class12;


public class Horse {
	
	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+" is running");
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	void printCompleteInfo() {
		System.out.println("name ="+name);
		System.out.println("breed ="+breed);
		System.out.println("age ="+age);
		System.out.println("weight ="+weight);
	}
	public static void main(String[] args) {
		
		Horse besh= new Horse();
		//accesing the property name on object besh and setting its value
		besh.name="spirit";
		besh.breed="stallion";
		besh.age=20;
		besh.weight=400;
		besh.run();
		
		besh.printCompleteInfo();
		System.out.println("*****************");
		Horse mrAssHorse=new Horse();
		mrAssHorse.name="Tuzik";
		mrAssHorse.breed="Mustang";
		mrAssHorse.age=15;
		mrAssHorse.weight=450;
		mrAssHorse.run();
		mrAssHorse.printCompleteInfo();
	}

}
